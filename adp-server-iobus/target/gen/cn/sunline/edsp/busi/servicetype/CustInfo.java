
package cn.sunline.edsp.busi.servicetype;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
	 /**
	  * 客户服务
	  */

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
@cn.sunline.adp.metadata.model.annotation.ConfigType(value="CustInfo", longname="客户服务", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.SERVICE)
public interface CustInfo {
	 /**
	  * Create customer information
	  */
	public void createCust(final cn.sunline.edsp.busi.servicetype.CustInfo.createCust.Input input, final cn.sunline.edsp.busi.servicetype.CustInfo.createCust.Output output);
	
	 /**
	  * Create customer information
	  */
	public static interface createCust {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createCust.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * 客户名称
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="客户名称")
		public String getCustna();
	 /**
	  * 客户电话
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="客户电话")
		public String getTeleno();
	 /**
	  * Card number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Card number")
		public String getCardno();
	 /**
	  * 住址
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="住址")
		public String getAddress();
	 /**
	  * 证件类型
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="证件类型")
		public cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE getCertype();
	 /**
	  * 证件号
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="证件号")
		public String getCertno();
	 /**
	  * Customer number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer number")
		public String getCustno();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createCust.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * 客户名称
	  */
		public void setCustna(String custna);
	 /**
	  * 客户电话
	  */
		public void setTeleno(String teleno);
	 /**
	  * Card number
	  */
		public void setCardno(String cardno);
	 /**
	  * 住址
	  */
		public void setAddress(String address);
	 /**
	  * 证件类型
	  */
		public void setCertype(cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE certype);
	 /**
	  * 证件号
	  */
		public void setCertno(String certno);
	 /**
	  * Customer number
	  */
		public void setCustno(String custno);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createCust.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
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
		
		public String toString();
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="createCust.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 客户信息查询
	  */
	public void queryCust(final cn.sunline.edsp.busi.servicetype.CustInfo.queryCust.Input input, final cn.sunline.edsp.busi.servicetype.CustInfo.queryCust.Output output);
	
	 /**
	  * 客户信息查询
	  */
	public static interface queryCust {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryCust.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * Customer number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Customer number")
		public String getCustno();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryCust.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * Customer number
	  */
		public void setCustno(String custno);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryCust.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
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
		
		public String toString();
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="queryCust.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
}

