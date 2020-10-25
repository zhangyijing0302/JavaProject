
package cn.sunline.edsp.busi.type;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
	 /**
	  * Basic restriction type
	  */

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
public interface BasicEnumType {
	 /**
	  * Account Status
	  */
		public static enum  E_ACCTST implements cn.sunline.edsp.base.lang.DefaultEnum<String>{
			 /**
			  * 0 - normal
			  */
			normal("normal","0","normal"),
			 /**
			  * 1 - logout
			  */
			closta("closta","1","logout");
			private E_ACCTST(String __id__ ,String __value__,String __longName__){
				this.__id__ = __id__;
				this.__value__ = __value__;
				this.__longName__ = __longName__;
				this.KEY="BasicEnumType.E_ACCTST."+__id__+".longname";
			}
			
			private String __id__;
			private String __value__;
			private String __longName__;
			private final String KEY;
			public String getId(){
				return this.__id__;
			}
			
			public String getValue(){
				return this.__value__;
			}
			
			public String getLocalLongName() {
				return new IString(KEY,__longName__).getLocalString();
			}
			
			public String getLongName() {
				return new IString(KEY,__longName__).getString();
			}
			
			public String toString(){
				return String.valueOf(this.__value__);
			} 
			
			public static boolean isIn(Object value){
				return cn.sunline.edsp.base.util.convert.EnumUtils.isInEnum(cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST.class, value);
			}
			
			public static E_ACCTST get(Object value){
				return cn.sunline.edsp.base.util.convert.EnumUtils.toEnum(cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST.class, value);
			}
			
		}
	 /**
	  * 证件类型
	  */
		public static enum  E_CERTYPE implements cn.sunline.edsp.base.lang.DefaultEnum<String>{
			 /**
			  * 0 - 身份证
			  */
			idcard("idcard","0","身份证"),
			 /**
			  * 1 - 护照
			  */
			passport("passport","1","护照");
			private E_CERTYPE(String __id__ ,String __value__,String __longName__){
				this.__id__ = __id__;
				this.__value__ = __value__;
				this.__longName__ = __longName__;
				this.KEY="BasicEnumType.E_CERTYPE."+__id__+".longname";
			}
			
			private String __id__;
			private String __value__;
			private String __longName__;
			private final String KEY;
			public String getId(){
				return this.__id__;
			}
			
			public String getValue(){
				return this.__value__;
			}
			
			public String getLocalLongName() {
				return new IString(KEY,__longName__).getLocalString();
			}
			
			public String getLongName() {
				return new IString(KEY,__longName__).getString();
			}
			
			public String toString(){
				return String.valueOf(this.__value__);
			} 
			
			public static boolean isIn(Object value){
				return cn.sunline.edsp.base.util.convert.EnumUtils.isInEnum(cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE.class, value);
			}
			
			public static E_CERTYPE get(Object value){
				return cn.sunline.edsp.base.util.convert.EnumUtils.toEnum(cn.sunline.edsp.busi.type.BasicEnumType.E_CERTYPE.class, value);
			}
			
		}

}

