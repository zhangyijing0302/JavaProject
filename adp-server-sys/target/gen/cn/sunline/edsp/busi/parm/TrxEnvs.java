
package cn.sunline.edsp.busi.parm;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
	 /**
	  * Public operation area
	  */

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
public interface TrxEnvs {
	 /**
	  * Public request field
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="TrxEnvs.Request", longname="Public request field" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface Request {
 	
	 /**
	  * corporate code
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="corporate code")
		public String getBossno();
	 /**
	  * corporate code
	  */
		public void setBossno(String bossno);
		
		public String toString();
	

		}
	 /**
	  * Public response field
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="TrxEnvs.Response", longname="Public response field" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface Response {
 	
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
	 /**
	  * Public run field (contains public request fields and public response fields)
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="TrxEnvs.RunEnvs", longname="Public run field (contains public request fields and public response fields)" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static interface RunEnvs {
 	
	 /**
	  * corporate code
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="corporate code")
		public String getBossno();
	 /**
	  * corporate code
	  */
		public void setBossno(String bossno);
		
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
	  * Account number
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="Account number")
		public String getAcctno();
	 /**
	  * Account number
	  */
		public void setAcctno(String acctno);
		
		public String toString();
	

		}

}

