
package cn.sunline.edsp.busi.servicetype;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
	 /**
	  * 卡信息服务
	  */

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
@cn.sunline.adp.metadata.model.annotation.ConfigType(value="CardInfo", longname="卡信息服务", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.SERVICE)
public interface CardInfo {
	 /**
	  * 开卡
	  */
	public void createCard(final cn.sunline.edsp.busi.servicetype.CardInfo.createCard.Input input, final cn.sunline.edsp.busi.servicetype.CardInfo.createCard.Output output);
	
	 /**
	  * 开卡
	  */
	public static interface createCard {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createCard.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * 卡号
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="卡号")
		public String getCardno();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createCard.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * 卡号
	  */
		public void setCardno(String cardno);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createCard.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
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
	  * 开卡时间
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="开卡时间")
		public java.sql.Timestamp getOpencartime();
	 /**
	  * 开卡时间
	  */
		public void setOpencartime(java.sql.Timestamp opencartime);
		
	 /**
	  * Account Status
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account Status")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST getAcctst();
	 /**
	  * Account Status
	  */
		public void setAcctst(cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST acctst);
		
	 /**
	  * 卡有效期
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="卡有效期")
		public java.sql.Timestamp getValidtime();
	 /**
	  * 卡有效期
	  */
		public void setValidtime(java.sql.Timestamp validtime);
		
		public String toString();
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createCard.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 卡状态检查
	  */
	public void checkCard(final cn.sunline.edsp.busi.servicetype.CardInfo.checkCard.Input input, final cn.sunline.edsp.busi.servicetype.CardInfo.checkCard.Output output);
	
	 /**
	  * 卡状态检查
	  */
	public static interface checkCard {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="checkCard.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="checkCard.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="checkCard.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="checkCard.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 卡信息查询
	  */
	public void queryCard(final cn.sunline.edsp.busi.servicetype.CardInfo.queryCard.Input input, final cn.sunline.edsp.busi.servicetype.CardInfo.queryCard.Output output);
	
	 /**
	  * 卡信息查询
	  */
	public static interface queryCard {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryCard.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryCard.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryCard.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
	 /**
	  * 卡信息
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="卡信息")
		public cn.sunline.edsp.busi.type.AtComplex.cardComplex getCard();
	 /**
	  * 卡信息
	  */
		public void setCard(cn.sunline.edsp.busi.type.AtComplex.cardComplex card);
		
		public String toString();
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryCard.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
}

