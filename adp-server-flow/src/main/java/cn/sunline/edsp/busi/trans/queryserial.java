
package cn.sunline.edsp.busi.trans;

import cn.sunline.adp.cedar.busi.sdk.biz.global.SysUtil;
import cn.sunline.edsp.busi.servicetype.AcctInfo;
import cn.sunline.edsp.busi.servicetype.AcctInfo.queryAcct.InputSetter;
import cn.sunline.edsp.busi.servicetype.AcctInfo.queryAcct.Output;

public class queryserial {

	public static void queryAcct(final cn.sunline.edsp.busi.trans.intf.Queryserial.Input input,
			final cn.sunline.edsp.busi.trans.intf.Queryserial.Property property,
			final cn.sunline.edsp.busi.trans.intf.Queryserial.Output output) {
		AcctInfo acctService = SysUtil.getInstanceByBind(AcctInfo.class, "queryserial.queryAcct");
		InputSetter acctInput = SysUtil.getInstance(InputSetter.class);
		Output acctOutput = SysUtil.getInstance(cn.sunline.edsp.busi.servicetype.AcctInfo.queryAcct.Output.class);
		acctInput.setCardno(input.getCardno());
		acctService.queryAcct(acctInput, acctOutput);
		
		String custno = acctOutput.getAcct().getCustno();
		property.setCustno(custno);
		
		output.setAcct(acctOutput.getAcct());
	}
}
