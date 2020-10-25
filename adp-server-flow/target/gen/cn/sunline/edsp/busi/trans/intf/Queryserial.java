
package cn.sunline.edsp.busi.trans.intf;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
public interface Queryserial {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryserial.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryserial.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryserial.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
	 /**
	  * 客户信息
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="客户信息")
		public cn.sunline.edsp.busi.type.AtComplex.cusComplex getCust();
	 /**
	  * 客户信息
	  */
		public void setCust(cn.sunline.edsp.busi.type.AtComplex.cusComplex cust);
		
	 /**
	  * 流水信息
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="流水信息")
		public Options<cn.sunline.edsp.busi.type.AtComplex.serialComplex> getSerials();
	 /**
	  * 流水信息
	  */
		public void setSerials(Options<cn.sunline.edsp.busi.type.AtComplex.serialComplex> serials);
		
	 /**
	  * 卡信息
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="卡信息")
		public cn.sunline.edsp.busi.type.AtComplex.cardComplex getCard();
	 /**
	  * 卡信息
	  */
		public void setCard(cn.sunline.edsp.busi.type.AtComplex.cardComplex card);
		
	 /**
	  * 账户信息
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户信息")
		public cn.sunline.edsp.busi.type.AtComplex.acctComplex getAcct();
	 /**
	  * 账户信息
	  */
		public void setAcct(cn.sunline.edsp.busi.type.AtComplex.acctComplex acct);
		
		public String toString();
	

	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryserial.Property", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Property {
 	
	 /**
	  * Customer number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer number")
		public String getCustno();
	 /**
	  * Customer number
	  */
		public void setCustno(String custno);
		
		public String toString();
	

	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryserial.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
}

