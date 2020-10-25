
package cn.sunline.edsp.busi.dict;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
	 /**
	  * Account module data dictionary
	  */

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
public interface AtDict {
	 /**
	  * Customer dictionary
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtDict.Cust", longname="Customer dictionary" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static enum Cust implements cn.sunline.edsp.base.lang.Symbol {
			/**
			  * Customer number
			  * 
			  */
            custno("custno", "Customer number", "", 100,0 ),
			/**
			  * Customer name
			  * 
			  */
            custna("custna", "Customer name", "", 100,0 ),
			/**
			  * Telephone number
			  * 
			  */
            teleno("teleno", "Telephone number", "", 100,0 )
					;
			
			private String __id__;
			private String __longname__;
			private String __description__;
			private int __length__;
			private int __fractionDigits__;
			private final String KEY;
			private Cust(String __id__, String __longname__, String __description__, int __length__, int __fractionDigits__){
				this.__id__ = __id__;
				this.__longname__ = __longname__;
				this.__description__ = __description__;
				this.__length__ = __length__;
				this.__fractionDigits__ = __fractionDigits__;
				this.KEY="AtDict.Cust."+__id__+".longname";
			}
	
			public String getId() {
				return this.__id__;
			}
			public String getDescription() {
				return this.__description__;
			}
			public String getLocalLongName() {
				return new IString(KEY,__longname__).getLocalString();
			}
			public String getLongName() {
				return new IString(KEY,__longname__).getString();
			}
			public int getLength() {
				return this.__length__;
			}
			public int getFractionDigits() {
				return this.__fractionDigits__;
			}
		}
	 /**
	  * Account dictionary
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtDict.Acct", longname="Account dictionary" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static enum Acct implements cn.sunline.edsp.base.lang.Symbol {
			/**
			  * Account number
			  * 
			  */
            acctno("acctno", "Account number", "", 100,0 ),
			/**
			  * Card number
			  * 
			  */
            cardno("cardno", "Card number", "", 100,0 ),
			/**
			  * Account Status
			  * 
			  */
            acctst("acctst", "Account Status", "", 1,0 ),
			/**
			  * Account Balance
			  * 
			  */
            acctam("acctam", "Account Balance", "", 20,2 ),
			/**
			  * 开卡时间
			  * 
			  */
            opencartime("opencartime", "开卡时间", "", 0,0 ),
			/**
			  * 卡有效期
			  * 
			  */
            validtime("validtime", "卡有效期", "", 0,0 ),
			/**
			  * 住址
			  * 
			  */
            address("address", "住址", "", 100,0 ),
			/**
			  * 证件类型
			  * 
			  */
            certype("certype", "证件类型", "", 0,0 ),
			/**
			  * 证件号
			  * 
			  */
            certno("certno", "证件号", "", 100,0 ),
			/**
			  * 账户额度
			  * 
			  */
            accquota("accquota", "账户额度", "", 20,2 ),
			/**
			  * 账户余额
			  * 
			  */
            balance("balance", "账户余额", "", 20,2 ),
			/**
			  * 消费金额
			  * 
			  */
            amount("amount", "消费金额", "", 20,2 ),
			/**
			  * 消费说明
			  * 
			  */
            description("description", "消费说明", "", 100,0 ),
			/**
			  * 剩余额度
			  * 
			  */
            remain("remain", "剩余额度", "", 20,2 ),
			/**
			  * 消费时间
			  * 
			  */
            cumtime("cumtime", "消费时间", "", 0,0 )
					;
			
			private String __id__;
			private String __longname__;
			private String __description__;
			private int __length__;
			private int __fractionDigits__;
			private final String KEY;
			private Acct(String __id__, String __longname__, String __description__, int __length__, int __fractionDigits__){
				this.__id__ = __id__;
				this.__longname__ = __longname__;
				this.__description__ = __description__;
				this.__length__ = __length__;
				this.__fractionDigits__ = __fractionDigits__;
				this.KEY="AtDict.Acct."+__id__+".longname";
			}
	
			public String getId() {
				return this.__id__;
			}
			public String getDescription() {
				return this.__description__;
			}
			public String getLocalLongName() {
				return new IString(KEY,__longname__).getLocalString();
			}
			public String getLongName() {
				return new IString(KEY,__longname__).getString();
			}
			public int getLength() {
				return this.__length__;
			}
			public int getFractionDigits() {
				return this.__fractionDigits__;
			}
		}
	 /**
	  * Trading dictionary
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtDict.Tran", longname="Trading dictionary" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static enum Tran implements cn.sunline.edsp.base.lang.Symbol {
			/**
			  * transaction amount
			  * 
			  */
            tranam("tranam", "transaction amount", "", 20,2 )
					;
			
			private String __id__;
			private String __longname__;
			private String __description__;
			private int __length__;
			private int __fractionDigits__;
			private final String KEY;
			private Tran(String __id__, String __longname__, String __description__, int __length__, int __fractionDigits__){
				this.__id__ = __id__;
				this.__longname__ = __longname__;
				this.__description__ = __description__;
				this.__length__ = __length__;
				this.__fractionDigits__ = __fractionDigits__;
				this.KEY="AtDict.Tran."+__id__+".longname";
			}
	
			public String getId() {
				return this.__id__;
			}
			public String getDescription() {
				return this.__description__;
			}
			public String getLocalLongName() {
				return new IString(KEY,__longname__).getLocalString();
			}
			public String getLongName() {
				return new IString(KEY,__longname__).getString();
			}
			public int getLength() {
				return this.__length__;
			}
			public int getFractionDigits() {
				return this.__fractionDigits__;
			}
		}
	 /**
	  * Common module
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtDict.Comm", longname="Common module" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static enum Comm implements cn.sunline.edsp.base.lang.Symbol {
			/**
			  * corporate code
			  * 
			  */
            bossno("bossno", "corporate code", "", 30,0 ),
			/**
			  * Trading serial number
			  * 
			  */
            tranno("tranno", "Trading serial number", "", 30,0 ),
			/**
			  * 账户信息
			  * 
			  */
            acct("acct", "账户信息", "", 0,0 ),
			/**
			  * 客户信息
			  * 
			  */
            cust("cust", "客户信息", "", 0,0 ),
			/**
			  * 卡信息
			  * 
			  */
            card("card", "卡信息", "", 0,0 ),
			/**
			  * 流水信息
			  * 
			  */
            serials("serials", "流水信息", "", 0,0 )
					;
			
			private String __id__;
			private String __longname__;
			private String __description__;
			private int __length__;
			private int __fractionDigits__;
			private final String KEY;
			private Comm(String __id__, String __longname__, String __description__, int __length__, int __fractionDigits__){
				this.__id__ = __id__;
				this.__longname__ = __longname__;
				this.__description__ = __description__;
				this.__length__ = __length__;
				this.__fractionDigits__ = __fractionDigits__;
				this.KEY="AtDict.Comm."+__id__+".longname";
			}
	
			public String getId() {
				return this.__id__;
			}
			public String getDescription() {
				return this.__description__;
			}
			public String getLocalLongName() {
				return new IString(KEY,__longname__).getLocalString();
			}
			public String getLongName() {
				return new IString(KEY,__longname__).getString();
			}
			public int getLength() {
				return this.__length__;
			}
			public int getFractionDigits() {
				return this.__fractionDigits__;
			}
		}
	 /**
	  * 用户
	  */
		@cn.sunline.adp.metadata.model.annotation.Index
		@cn.sunline.adp.metadata.model.annotation.ConfigType(value="AtDict.User", longname="用户" , type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
		public static enum User implements cn.sunline.edsp.base.lang.Symbol {
			/**
			  * userID
			  * 
			  */
            userid("userid", "userID", "", 15,0 ),
			/**
			  * userName
			  * 
			  */
            userName("userName", "userName", "", 15,0 ),
			/**
			  * userAge
			  * 
			  */
            userAge("userAge", "userAge", "", 15,0 )
					;
			
			private String __id__;
			private String __longname__;
			private String __description__;
			private int __length__;
			private int __fractionDigits__;
			private final String KEY;
			private User(String __id__, String __longname__, String __description__, int __length__, int __fractionDigits__){
				this.__id__ = __id__;
				this.__longname__ = __longname__;
				this.__description__ = __description__;
				this.__length__ = __length__;
				this.__fractionDigits__ = __fractionDigits__;
				this.KEY="AtDict.User."+__id__+".longname";
			}
	
			public String getId() {
				return this.__id__;
			}
			public String getDescription() {
				return this.__description__;
			}
			public String getLocalLongName() {
				return new IString(KEY,__longname__).getLocalString();
			}
			public String getLongName() {
				return new IString(KEY,__longname__).getString();
			}
			public int getLength() {
				return this.__length__;
			}
			public int getFractionDigits() {
				return this.__fractionDigits__;
			}
		}

}

