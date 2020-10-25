
package cn.sunline.edsp.busi.serviceimpl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import cn.sunline.adp.cedar.busi.sdk.biz.global.SysUtil;
import cn.sunline.edsp.base.lang.Options;
import cn.sunline.edsp.base.lang.options.DefaultOptions;
import cn.sunline.edsp.base.util.date.DateUtil;
import cn.sunline.edsp.busi.errors.AtErrorDef.AtError;
import cn.sunline.edsp.busi.servicetype.AcctInfo.consumeAcct.Input;
import cn.sunline.edsp.busi.servicetype.AcctInfo.consumeAcct.Output;
import cn.sunline.edsp.busi.tables.AtTable.Kapp_acctDao;
import cn.sunline.edsp.busi.tables.AtTable.Kapp_cum_serialDao;
import cn.sunline.edsp.busi.tables.AtTable.kapp_acct;
import cn.sunline.edsp.busi.tables.AtTable.kapp_cum_serial;
import cn.sunline.edsp.busi.type.AtComplex.acctComplex;
import cn.sunline.edsp.busi.type.AtComplex.serialComplex;
import cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST;

/**
 * Accont type service implementation
 *
 */
@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.ConfigType(value = "AcctInfoImpl", longname = "Accont type service implementation", type = cn.sunline.adp.metadata.model.annotation.ConfigType.Type.SERVICE)
public class AcctInfoImpl implements cn.sunline.edsp.busi.servicetype.AcctInfo {
	/**
	 * Create account information
	 *
	 */
	public void createAcct(final cn.sunline.edsp.busi.servicetype.AcctInfo.createAcct.Input input,
			final cn.sunline.edsp.busi.servicetype.AcctInfo.createAcct.Output output) {
		kapp_acct acct = SysUtil.getInstance(kapp_acct.class);
		// 初始化默认额度
		acct.setAccquota(new BigDecimal(20000D));
		// 消费余额
		acct.setBalance(new BigDecimal(0D));
		acct.setAcctno("acct:" + System.currentTimeMillis());
		acct.setAcctst(E_ACCTST.normal);
		acct.setCardno(input.getCardno());
		acct.setCustno(input.getCustno());

		Kapp_acctDao.insert(acct);
		
		output.setAccquota(acct.getAccquota());
		output.setAcctno(acct.getAcctno());
		output.setCardno(acct.getCardno());
	}

	@Override
	public void consumeAcct(Input input, Output output) {
		kapp_acct acct = Kapp_acctDao.selectOne_odb1(input.getCardno(), false);
		// 计算可用额度
		BigDecimal remainBalance = acct.getAccquota().subtract(acct.getBalance());
		// 判断剩余额度是否足够
		if(remainBalance.doubleValue() < input.getAmount().doubleValue()) {
			AtError.E006(acct.getCardno(), input.getAmount());
		}
		
		// 增加消费
		acct.setBalance(acct.getBalance().add(input.getAmount()));
		Kapp_acctDao.updateOne_odb1(acct);
		
		// 等级消费流水
		kapp_cum_serial cumSerial = SysUtil.getInstance(kapp_cum_serial.class);
		cumSerial.setTranno(System.currentTimeMillis()+"");
		cumSerial.setAccquota(acct.getAccquota());
		cumSerial.setAmount(input.getAmount());
		cumSerial.setBalance(acct.getBalance());
		cumSerial.setCardno(acct.getCardno());
		cumSerial.setCumtime(new Timestamp(System.currentTimeMillis()));
		cumSerial.setDescription(input.getDescription());
		cumSerial.setRemain(acct.getAccquota().subtract(acct.getBalance()));
		Kapp_cum_serialDao.insert(cumSerial);
		
		output.setAccquota(cumSerial.getAccquota());
		output.setBalance(cumSerial.getBalance());
		output.setCardno(cumSerial.getCardno());
		output.setCumtime(cumSerial.getCumtime());
		output.setDescription(cumSerial.getDescription());
		output.setRemain(cumSerial.getRemain());
		output.setTranno(cumSerial.getTranno());
	}

	@Override
	public void queryAcct(cn.sunline.edsp.busi.servicetype.AcctInfo.queryAcct.Input input,
			cn.sunline.edsp.busi.servicetype.AcctInfo.queryAcct.Output output) {
		kapp_acct acct = Kapp_acctDao.selectOne_odb1(input.getCardno(), false);
		
		acctComplex ret = SysUtil.getInstance(acctComplex.class);
		ret.setAccquota(acct.getAccquota());
		ret.setAcctno(acct.getAcctno());
		ret.setAcctst(acct.getAcctst());
		ret.setBalance(acct.getBalance());
		ret.setRemain(acct.getAccquota().subtract(ret.getBalance()));
		ret.setCustno(acct.getCustno());
		output.setAcct(ret);
	}

	@Override
	public void queryComSerial(cn.sunline.edsp.busi.servicetype.AcctInfo.queryComSerial.Input input,
			cn.sunline.edsp.busi.servicetype.AcctInfo.queryComSerial.Output output) {
		List<kapp_cum_serial> serials = Kapp_cum_serialDao.selectAll_odb1(input.getCardno(), false);
		Options<serialComplex> ret = new DefaultOptions();
		for(int i=0;i<serials.size();i++) {
			kapp_cum_serial kappSerial = serials.get(i);
			serialComplex serial = SysUtil.getInstance(serialComplex.class);
			serial.setAccquota(kappSerial.getAccquota());
			serial.setAmount(kappSerial.getAmount());
			serial.setBalance(kappSerial.getBalance());
			serial.setCardno(kappSerial.getCardno());
			serial.setDescription(kappSerial.getDescription());
			serial.setRemain(kappSerial.getRemain());
			serial.setTranno(kappSerial.getTranno());
			serial.setCumtime(DateUtil.formatDate(new Date(kappSerial.getCumtime().getTime())));
			ret.add(serial);
		}
		output.setSerials(ret);
	}
}
