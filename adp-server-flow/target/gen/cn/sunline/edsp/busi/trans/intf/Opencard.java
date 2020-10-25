
package cn.sunline.edsp.busi.trans.intf;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
public interface Opencard {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="opencard.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * Customer name
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer name")
		public String getCustna();
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
	 /**
	  * Telephone number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Telephone number")
		public String getTeleno();
	 /**
	  * Customer number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer number")
		public String getCustno();
	 /**
	  * 住址
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="住址")
		public String getAddress();
	 /**
	  * 证件号
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="证件号")
		public String getCertno();
	 /**
	  * 证件类型
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="证件类型")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE getCertype();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="opencard.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * Customer name
	  */
		public void setCustna(String custna);
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
	 /**
	  * Telephone number
	  */
		public void setTeleno(String teleno);
	 /**
	  * Customer number
	  */
		public void setCustno(String custno);
	 /**
	  * 住址
	  */
		public void setAddress(String address);
	 /**
	  * 证件号
	  */
		public void setCertno(String certno);
	 /**
	  * 证件类型
	  */
		public void setCertype(cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE certype);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="opencard.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
	 /**
	  * Customer number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer number")
		public String getCustno();
	 /**
	  * Customer number
	  */
		public void setCustno(String custno);
		
	 /**
	  * Account number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account number")
		public String getAcctno();
	 /**
	  * Account number
	  */
		public void setAcctno(String acctno);
		
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
		
	 /**
	  * Account Balance
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account Balance")
		public java.math.BigDecimal getAcctam();
	 /**
	  * Account Balance
	  */
		public void setAcctam(java.math.BigDecimal acctam);
		
	 /**
	  * Account Status
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account Status")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST getAcctst();
	 /**
	  * Account Status
	  */
		public void setAcctst(cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST acctst);
		
		public String toString();
	

	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="opencard.Property", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
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
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="opencard.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
}

