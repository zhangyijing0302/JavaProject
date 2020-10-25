
package cn.sunline.edsp.busi.servicetype;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
	 /**
	  * 账户服务
	  */

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AcctInfo", longname="账户服务", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.SERVICE)
public interface AcctInfo {
	 /**
	  * Create account information
	  */
	public void createAcct(final cn.sunline.edsp.busi.servicetype.AcctInfo.createAcct.Input input, final cn.sunline.edsp.busi.servicetype.AcctInfo.createAcct.Output output);
	
	 /**
	  * Create account information
	  */
	public static interface createAcct {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createAcct.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
	 /**
	  * Account number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account number")
		public String getAcctno();
	 /**
	  * 账户额度
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户额度")
		public java.math.BigDecimal getAccquota();
	 /**
	  * Customer number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer number")
		public String getCustno();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createAcct.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
	 /**
	  * Account number
	  */
		public void setAcctno(String acctno);
	 /**
	  * 账户额度
	  */
		public void setAccquota(java.math.BigDecimal accquota);
	 /**
	  * Customer number
	  */
		public void setCustno(String custno);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createAcct.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
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
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createAcct.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 账户消费
	  */
	public void consumeAcct(final cn.sunline.edsp.busi.servicetype.AcctInfo.consumeAcct.Input input, final cn.sunline.edsp.busi.servicetype.AcctInfo.consumeAcct.Output output);
	
	 /**
	  * 账户消费
	  */
	public static interface consumeAcct {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="consumeAcct.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
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
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="consumeAcct.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
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
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="consumeAcct.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
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
	  * 账户额度
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户额度")
		public java.math.BigDecimal getAccquota();
	 /**
	  * 账户额度
	  */
		public void setAccquota(java.math.BigDecimal accquota);
		
	 /**
	  * 账户余额
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="账户余额")
		public java.math.BigDecimal getBalance();
	 /**
	  * 账户余额
	  */
		public void setBalance(java.math.BigDecimal balance);
		
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
	  * 消费时间
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费时间")
		public java.sql.Timestamp getCumtime();
	 /**
	  * 消费时间
	  */
		public void setCumtime(java.sql.Timestamp cumtime);
		
	 /**
	  * 剩余额度
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="剩余额度")
		public java.math.BigDecimal getRemain();
	 /**
	  * 剩余额度
	  */
		public void setRemain(java.math.BigDecimal remain);
		
	 /**
	  * Trading serial number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Trading serial number")
		public String getTranno();
	 /**
	  * Trading serial number
	  */
		public void setTranno(String tranno);
		
		public String toString();
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="consumeAcct.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 查询账户信息
	  */
	public void queryAcct(final cn.sunline.edsp.busi.servicetype.AcctInfo.queryAcct.Input input, final cn.sunline.edsp.busi.servicetype.AcctInfo.queryAcct.Output output);
	
	 /**
	  * 查询账户信息
	  */
	public static interface queryAcct {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryAcct.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryAcct.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryAcct.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
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
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryAcct.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 消费流水查询
	  */
	public void queryComSerial(final cn.sunline.edsp.busi.servicetype.AcctInfo.queryComSerial.Input input, final cn.sunline.edsp.busi.servicetype.AcctInfo.queryComSerial.Output output);
	
	 /**
	  * 消费流水查询
	  */
	public static interface queryComSerial {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryComSerial.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryComSerial.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryComSerial.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
	 /**
	  * 流水信息
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="流水信息")
		public Options<cn.sunline.edsp.busi.type.AtComplex.serialComplex> getSerials();
	 /**
	  * 流水信息
	  */
		public void setSerials(Options<cn.sunline.edsp.busi.type.AtComplex.serialComplex> serials);
		
		public String toString();
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryComSerial.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
}

