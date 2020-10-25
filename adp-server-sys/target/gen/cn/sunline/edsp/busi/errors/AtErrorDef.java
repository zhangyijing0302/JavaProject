
package cn.sunline.edsp.busi.errors;
 /**
  * Account module error code definition file
  *
  */
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
import cn.sunline.adp.core.exception.*;

@cn.sunline.adp.core.annotation.Generated
public class AtErrorDef {
		 /**
		  * Account module error code definition file...
		  *
		  */
		public static class AtError {
		
			/**
			  *	New customer failed!
			  */
			public final static String F_E001 = "AtError.E001";

			private final static IString E001 = new IString("AtErrorDef.AtError.E001","New customer failed!");
			
		    /**
			  * New customer failed!
			  *
			  */	
			public static String E001_ERROR() {
				return E001.getString();
			} 
			
			
			/**
			  * New customer failed!
			  *
			  */	
			public static AdpBusinessException E001() throws AdpBusinessException{
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E001,new IString(E001,null));
			}
	
			/**
			  * New customer failed!
			  * @param t
			  */	
			public static AdpBusinessException E001( Throwable t) throws AdpBusinessException{
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E001,new IString(E001,null), t);
			}
			/**
			  *	New account failed!
			  */
			public final static String F_E002 = "AtError.E002";

			private final static IString E002 = new IString("AtErrorDef.AtError.E002","New account failed!");
			
		    /**
			  * New account failed!
			  *
			  */	
			public static String E002_ERROR() {
				return E002.getString();
			} 
			
			
			/**
			  * New account failed!
			  *
			  */	
			public static AdpBusinessException E002() throws AdpBusinessException{
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E002,new IString(E002,null));
			}
	
			/**
			  * New account failed!
			  * @param t
			  */	
			public static AdpBusinessException E002( Throwable t) throws AdpBusinessException{
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E002,new IString(E002,null), t);
			}
			/**
			  *	卡号[%s]不存在！
			  */
			public final static String F_E003 = "AtError.E003";

			private final static IString E003 = new IString("AtErrorDef.AtError.E003","卡号[%s]不存在！");
			
		    /**
			  * 卡号[%s]不存在！
			  *	@param cardNo
			  *
			  */	
			public static String E003_ERROR( String cardNo) {
				Params context = new Params().add("cardNo", cardNo);
				String message =new IString(E003,context).getString();
				return message;
			} 
			
			
			/**
			  * 卡号[%s]不存在！
			  *	@param cardNo
			  *
			  */	
			public static AdpBusinessException E003( String cardNo) throws AdpBusinessException{
				Params context = new Params().add("cardNo", cardNo);
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E003,new IString(E003,context));
			}
	
			/**
			  * 卡号[%s]不存在！
			  *	@param cardNo
			  * @param t
			  */	
			public static AdpBusinessException E003( String cardNo, Throwable t) throws AdpBusinessException{
				Params context = new Params().add("cardNo", cardNo);
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E003,new IString(E003,context), t);
			}
			/**
			  *	卡号[%s]状态不可用！
			  */
			public final static String F_E004 = "AtError.E004";

			private final static IString E004 = new IString("AtErrorDef.AtError.E004","卡号[%s]状态不可用！");
			
		    /**
			  * 卡号[%s]状态不可用！
			  *	@param cardno
			  *
			  */	
			public static String E004_ERROR( String cardno) {
				Params context = new Params().add("cardno", cardno);
				String message =new IString(E004,context).getString();
				return message;
			} 
			
			
			/**
			  * 卡号[%s]状态不可用！
			  *	@param cardno
			  *
			  */	
			public static AdpBusinessException E004( String cardno) throws AdpBusinessException{
				Params context = new Params().add("cardno", cardno);
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E004,new IString(E004,context));
			}
	
			/**
			  * 卡号[%s]状态不可用！
			  *	@param cardno
			  * @param t
			  */	
			public static AdpBusinessException E004( String cardno, Throwable t) throws AdpBusinessException{
				Params context = new Params().add("cardno", cardno);
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E004,new IString(E004,context), t);
			}
			/**
			  *	卡号[%s]超过当前有效期[%s]！
			  */
			public final static String F_E005 = "AtError.E005";

			private final static IString E005 = new IString("AtErrorDef.AtError.E005","卡号[%s]超过当前有效期[%s]！");
			
		    /**
			  * 卡号[%s]超过当前有效期[%s]！
			  *	@param cardno
			  *	@param validtime
			  *
			  */	
			public static String E005_ERROR( String cardno, java.sql.Timestamp validtime) {
				Params context = new Params().add("cardno", cardno).add("validtime", validtime);
				String message =new IString(E005,context).getString();
				return message;
			} 
			
			
			/**
			  * 卡号[%s]超过当前有效期[%s]！
			  *	@param cardno
			  *	@param validtime
			  *
			  */	
			public static AdpBusinessException E005( String cardno, java.sql.Timestamp validtime) throws AdpBusinessException{
				Params context = new Params().add("cardno", cardno).add("validtime", validtime);
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E005,new IString(E005,context));
			}
	
			/**
			  * 卡号[%s]超过当前有效期[%s]！
			  *	@param cardno
			  *	@param validtime
			  * @param t
			  */	
			public static AdpBusinessException E005( String cardno, java.sql.Timestamp validtime, Throwable t) throws AdpBusinessException{
				Params context = new Params().add("cardno", cardno).add("validtime", validtime);
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E005,new IString(E005,context), t);
			}
			/**
			  *	卡号[%s]对应的额度不足[%s]！
			  */
			public final static String F_E006 = "AtError.E006";

			private final static IString E006 = new IString("AtErrorDef.AtError.E006","卡号[%s]对应的额度不足[%s]！");
			
		    /**
			  * 卡号[%s]对应的额度不足[%s]！
			  *	@param cardno
			  *	@param remain
			  *
			  */	
			public static String E006_ERROR( String cardno, java.math.BigDecimal remain) {
				Params context = new Params().add("cardno", cardno).add("remain", remain);
				String message =new IString(E006,context).getString();
				return message;
			} 
			
			
			/**
			  * 卡号[%s]对应的额度不足[%s]！
			  *	@param cardno
			  *	@param remain
			  *
			  */	
			public static AdpBusinessException E006( String cardno, java.math.BigDecimal remain) throws AdpBusinessException{
				Params context = new Params().add("cardno", cardno).add("remain", remain);
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E006,new IString(E006,context));
			}
	
			/**
			  * 卡号[%s]对应的额度不足[%s]！
			  *	@param cardno
			  *	@param remain
			  * @param t
			  */	
			public static AdpBusinessException E006( String cardno, java.math.BigDecimal remain, Throwable t) throws AdpBusinessException{
				Params context = new Params().add("cardno", cardno).add("remain", remain);
				throw new AdpBusinessException(cn.sunline.adp.core.exception.ErrorType.ERROR, F_E006,new IString(E006,context), t);
			}
		}
		
}

