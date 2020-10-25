
package cn.sunline.edsp.busi.adp.server.iobus.servicetype;
import cn.sunline.adp.core.exception.InternationalConstantDef;
import cn.sunline.adp.core.lang.IString;
import cn.sunline.edsp.base.lang.*;
	 /**
	  * 用户信息
	  */

@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.Index
@cn.sunline.adp.metadata.model.annotation.ConfigType(value="UserInfo", longname="用户信息", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.SERVICE)
public interface UserInfo {
	 /**
	  * 根据ID查询用户信息
	  */
	public void selectOneUserById(final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.selectOneUserById.Input input, final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.selectOneUserById.Output output);
	
	 /**
	  * 根据ID查询用户信息
	  */
	public static interface selectOneUserById {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="selectOneUserById.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * userID
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userID")
		public String getUserid();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="selectOneUserById.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * userID
	  */
		public void setUserid(String userid);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="selectOneUserById.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
	 /**
	  * userID
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userID")
		public String getUserid();
	 /**
	  * userID
	  */
		public void setUserid(String userid);
		
	 /**
	  * userName
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userName")
		public String getUserName();
	 /**
	  * userName
	  */
		public void setUserName(String userName);
		
	 /**
	  * userAge
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userAge")
		public String getUserAge();
	 /**
	  * userAge
	  */
		public void setUserAge(String userAge);
		
		public String toString();
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="selectOneUserById.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 删除用户
	  */
	public void deleteUserById(final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.deleteUserById.Input input, final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.deleteUserById.Output output);
	
	 /**
	  * 删除用户
	  */
	public static interface deleteUserById {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="deleteUserById.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * userID
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userID")
		public String getUserid();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="deleteUserById.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * userID
	  */
		public void setUserid(String userid);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="deleteUserById.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="deleteUserById.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 更新用户信息
	  */
	public void updateUserInfo(final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.updateUserInfo.Input input, final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.updateUserInfo.Output output);
	
	 /**
	  * 更新用户信息
	  */
	public static interface updateUserInfo {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="updateUserInfo.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * userID
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userID")
		public String getUserid();
	 /**
	  * userName
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userName")
		public String getUserName();
	 /**
	  * userAge
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userAge")
		public String getUserAge();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="updateUserInfo.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * userID
	  */
		public void setUserid(String userid);
	 /**
	  * userName
	  */
		public void setUserName(String userName);
	 /**
	  * userAge
	  */
		public void setUserAge(String userAge);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="updateUserInfo.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="updateUserInfo.Printer", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 添加用户
	  */
	public void insertUserInfo(final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.insertUserInfo.Input input, final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.insertUserInfo.Output output);
	
	 /**
	  * 添加用户
	  */
	public static interface insertUserInfo {
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="insertUserInfo.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Input {
 	
	 /**
	  * userID
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userID")
		public String getUserid();
	 /**
	  * userName
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userName")
		public String getUserName();
	 /**
	  * userAge
	  */
		@cn.sunline.adp.metadata.model.annotation.Element(longname="userAge")
		public String getUserAge();
		public String toString();
	

	}
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="insertUserInfo.Input", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface InputSetter extends Input {
	 /**
	  * userID
	  */
		public void setUserid(String userid);
	 /**
	  * userName
	  */
		public void setUserName(String userName);
	 /**
	  * userAge
	  */
		public void setUserAge(String userAge);
	}
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="insertUserInfo.Output", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Output {
 	
	

	}
	
	
	@cn.sunline.adp.metadata.model.annotation.Index
	@cn.sunline.adp.metadata.model.annotation.ConfigType(value="", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.JAVA_BEAN)
	public static interface Printer {
 	
	

	}
	
	}
}

