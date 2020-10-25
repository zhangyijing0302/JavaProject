
package cn.sunline.edsp.busi.trans;

import java.util.HashMap;
import java.util.Map;

import org.jfree.util.Log;

import cn.sunline.adp.cedar.base.util.CoreUtil;
import cn.sunline.adp.cedar.service.router.drs.util.CustomDrsRegistUtil;
import cn.sunline.edsp.midware.drs.common.model.Consumer;

public class opencard {

	public static void welcome(final cn.sunline.edsp.busi.trans.intf.Opencard.Input input,
			final cn.sunline.edsp.busi.trans.intf.Opencard.Property property,
			final cn.sunline.edsp.busi.trans.intf.Opencard.Output output) {

	}

	public static void drsRegister(final cn.sunline.edsp.busi.trans.intf.Opencard.Input input,
			final cn.sunline.edsp.busi.trans.intf.Opencard.Property property,
			final cn.sunline.edsp.busi.trans.intf.Opencard.Output output) {
		try {
			Consumer consumer = new Consumer();
			consumer.setPrimaryKeyValue(input.getCustno());
			Map<String, Object> fields = new HashMap<>();
			fields.put("ecif", input.getCustno());
			fields.put("idCard", input.getCertno());
			fields.put("bankAccount", output.getAcctno());
			fields.put("mobile", input.getTeleno());
			consumer.setFields(fields);
			CustomDrsRegistUtil.registryDCN(consumer, CoreUtil.getDefaultTenantId(), CoreUtil.getDcnNo());
		}catch(Exception e) {
			Log.error("----注册到DCN失败！！-------");
		}
	}
}
