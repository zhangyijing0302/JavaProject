
package cn.sunline.edsp.busi.serviceimpl;

import cn.sunline.adp.cedar.busi.sdk.biz.global.SysUtil;
import cn.sunline.edsp.busi.tables.AtTable.Kapp_custDao;
import cn.sunline.edsp.busi.tables.AtTable.kapp_cust;
import cn.sunline.edsp.busi.type.AtComplex.cusComplex;

/**
 * 客户服务实现
 *
 */
@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.ConfigType(value = "CustInfoImpl", longname = "客户服务实现", type = cn.sunline.adp.metadata.model.annotation.ConfigType.Type.SERVICE)
public class CustInfoImpl implements cn.sunline.edsp.busi.servicetype.CustInfo {
	/**
	 * Create customer information
	 *
	 */
	public void createCust(final cn.sunline.edsp.busi.servicetype.CustInfo.createCust.Input input,
			final cn.sunline.edsp.busi.servicetype.CustInfo.createCust.Output output) {
		kapp_cust cust = SysUtil.getInstance(kapp_cust.class);
		cust.setAddress(input.getAddress());
		cust.setCertno(input.getCertno());
		cust.setCertype(input.getCertype());
		cust.setCustna(input.getCustna());
		cust.setCustno(input.getCustno());
		cust.setTeleno(input.getTeleno());

		Kapp_custDao.insert(cust);

		output.setCustno(cust.getCustno());
	}

	@Override
	public void queryCust(cn.sunline.edsp.busi.servicetype.CustInfo.queryCust.Input input, cn.sunline.edsp.busi.servicetype.CustInfo.queryCust.Output output) {
		kapp_cust cust = Kapp_custDao.selectOne_odb1(input.getCustno(), false);
		
		cusComplex ret = SysUtil.getInstance(cusComplex.class);
		ret.setAddress(cust.getAddress());
		ret.setCertno(cust.getCertno());
		ret.setCertype(cust.getCertype());
		ret.setCustna(cust.getCustna());
		ret.setCustno(cust.getCustno());
		ret.setTeleno(cust.getTeleno());
		output.setCust(ret);
	}
}
