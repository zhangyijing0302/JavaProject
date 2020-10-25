
package cn.sunline.edsp.busi.serviceimpl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import cn.sunline.adp.cedar.busi.sdk.biz.global.SysUtil;
import cn.sunline.edsp.busi.errors.AtErrorDef.AtError;
import cn.sunline.edsp.busi.servicetype.CardInfo.checkCard.Input;
import cn.sunline.edsp.busi.servicetype.CardInfo.checkCard.Output;
import cn.sunline.edsp.busi.tables.AtTable.Kapp_cardDao;
import cn.sunline.edsp.busi.tables.AtTable.kapp_card;
import cn.sunline.edsp.busi.type.AtComplex.cardComplex;
import cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST;

/**
 * 卡服务实现
 *
 */
@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.ConfigType(value = "CardInfoImpl", longname = "卡服务实现", type = cn.sunline.adp.metadata.model.annotation.ConfigType.Type.SERVICE)
public class CardInfoImpl implements cn.sunline.edsp.busi.servicetype.CardInfo {
	/**
	 * 开卡
	 *
	 */
	public void createCard(final cn.sunline.edsp.busi.servicetype.CardInfo.createCard.Input input,
			final cn.sunline.edsp.busi.servicetype.CardInfo.createCard.Output output) {
		kapp_card card = SysUtil.getInstance(kapp_card.class);
		card.setCardno(input.getCardno());
		card.setAcctst(E_ACCTST.normal);
		card.setOpencartime(new Timestamp(System.currentTimeMillis()));

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 5);
		Date dt = cal.getTime();
		card.setValidtime(new Timestamp(dt.getTime()));

		Kapp_cardDao.insert(card);
		
		output.setAcctst(card.getAcctst());
		output.setCardno(card.getCardno());
		output.setOpencartime(card.getOpencartime());
		output.setValidtime(card.getValidtime());
	}

	@Override
	public void checkCard(Input input, Output output) {
		kapp_card card = Kapp_cardDao.selectOne_odb1(input.getCardno(), false);
		if(card == null) {
			AtError.E003(input.getCardno());
		}
		
		// 账户状态检查 
		if(card.getAcctst() == E_ACCTST.closta) {
			AtError.E004(input.getCardno());
		}
		
		// 超过有效期
		if(card.getValidtime().before(new Timestamp(System.currentTimeMillis()))) {
			AtError.E005(input.getCardno(), card.getValidtime());
		}
	}

	@Override
	public void queryCard(cn.sunline.edsp.busi.servicetype.CardInfo.queryCard.Input input,
			cn.sunline.edsp.busi.servicetype.CardInfo.queryCard.Output output) {
		kapp_card card = Kapp_cardDao.selectOne_odb1(input.getCardno(), false);
		cardComplex ret = SysUtil.getInstance(cardComplex.class);
		ret.setAcctst(card.getAcctst());
		ret.setCardno(card.getCardno());
		ret.setOpencartime(card.getOpencartime());
		ret.setValidtime(card.getValidtime());
		output.setCard(ret);
	}
}
