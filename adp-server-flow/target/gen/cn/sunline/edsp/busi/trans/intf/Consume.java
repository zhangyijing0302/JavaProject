
package cn.sunline.edsp.busi.trans.intf;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
public interface Consume {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="consume.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
	 /**
	  * 消费金额
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费金额")
		public java.math.BigDecimal getAmount();
	 /**
	  * 消费说明
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费说明")
		public String getDescription();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="consume.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
	 /**
	  * 消费金额
	  */
		public void setAmount(java.math.BigDecimal amount);
	 /**
	  * 消费说明
	  */
		public void setDescription(String description);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="consume.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
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
	  * 消费说明
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费说明")
		public String getDescription();
	 /**
	  * 消费说明
	  */
		public void setDescription(String description);
		
	 /**
	  * Trading serial number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Trading serial number")
		public String getTranno();
	 /**
	  * Trading serial number
	  */
		public void setTranno(String tranno);
		
	 /**
	  * 账户余额
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户余额")
		public java.math.BigDecimal getRemain();
	 /**
	  * 账户余额
	  */
		public void setRemain(java.math.BigDecimal remain);
		
	 /**
	  * 消费时间
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费时间")
		public java.sql.Timestamp getCumtime();
	 /**
	  * 消费时间
	  */
		public void setCumtime(java.sql.Timestamp cumtime);
		
	 /**
	  * 账户额度
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户额度")
		public java.math.BigDecimal getAccquota();
	 /**
	  * 账户额度
	  */
		public void setAccquota(java.math.BigDecimal accquota);
		
		public String toString();
	

	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="consume.Property", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Property {
 	
	

	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="consume.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
}

