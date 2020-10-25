
package cn.sunline.edsp.busi.type;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
	 /**
	  * Composite type of account module
	  */

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
public interface AtComplex {
	 /**
	  * 账户复合类型
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtComplex.acctComplex", longname="账户复合类型" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface acctComplex {
 	
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
	  * Account Status
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account Status")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST getAcctst();
	 /**
	  * Account Status
	  */
		public void setAcctst(cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST acctst);
		
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
	  * 剩余额度
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="剩余额度")
		public java.math.BigDecimal getRemain();
	 /**
	  * 剩余额度
	  */
		public void setRemain(java.math.BigDecimal remain);
		
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
	 /**
	  * 客户复合类型
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtComplex.cusComplex", longname="客户复合类型" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface cusComplex {
 	
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
	  * Customer name
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer name")
		public String getCustna();
	 /**
	  * Customer name
	  */
		public void setCustna(String custna);
		
	 /**
	  * Telephone number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Telephone number")
		public String getTeleno();
	 /**
	  * Telephone number
	  */
		public void setTeleno(String teleno);
		
	 /**
	  * 住址
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="住址")
		public String getAddress();
	 /**
	  * 住址
	  */
		public void setAddress(String address);
		
	 /**
	  * 证件类型
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="证件类型")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE getCertype();
	 /**
	  * 证件类型
	  */
		public void setCertype(cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE certype);
		
	 /**
	  * 证件号
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="证件号")
		public String getCertno();
	 /**
	  * 证件号
	  */
		public void setCertno(String certno);
		
		public String toString();
	

		}
	 /**
	  * 卡信息复合类型
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtComplex.cardComplex", longname="卡信息复合类型" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface cardComplex {
 	
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
	  * Account Status
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account Status")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST getAcctst();
	 /**
	  * Account Status
	  */
		public void setAcctst(cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST acctst);
		
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
	 /**
	  * 流水符合类型
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtComplex.serialComplex", longname="流水符合类型" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface serialComplex {
 	
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
	  * Trading serial number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Trading serial number")
		public String getTranno();
	 /**
	  * Trading serial number
	  */
		public void setTranno(String tranno);
		
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
	  * 消费金额
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费金额")
		public java.math.BigDecimal getAmount();
	 /**
	  * 消费金额
	  */
		public void setAmount(java.math.BigDecimal amount);
		
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
	  * 剩余额度
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="剩余额度")
		public java.math.BigDecimal getRemain();
	 /**
	  * 剩余额度
	  */
		public void setRemain(java.math.BigDecimal remain);
		
	 /**
	  * 消费时间
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="消费时间")
		public String getCumtime();
	 /**
	  * 消费时间
	  */
		public void setCumtime(String cumtime);
		
		public String toString();
	

		}

}

