
package cn.sunline.edsp.busi.adp.server.cust.serviceimpl;

import cn.sunline.adp.cedar.busi.sdk.biz.global.SysUtil;
import cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.selectOneUserById.Input;
import cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.selectOneUserById.Output;
import cn.sunline.edsp.busi.tables.AtTable.User_tableDao;
import cn.sunline.edsp.busi.tables.AtTable.user_table;

/**
  * 用户信息实现
  *
  */
@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.ConfigType(value="UserInfoImpl", longname="用户信息实现", type=cn.sunline.adp.metadata.model.annotation.ConfigType.Type.SERVICE)
public class UserInfoImpl implements cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo{

	@Override
	public void insertUserInfo( final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.insertUserInfo.Input input,  final cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.insertUserInfo.Output output){
		System.out.println("----------------------------------------------------------------");
		System.out.println("增加用户----------------------------------------------------------------");
		String userid = input.getUserid();
		String userName = input.getUserName();
		String userAge = input.getUserAge();
		user_table user = SysUtil.getInstance(user_table.class);
		user.setUserid(userid);
		user.setUserName(userName);
		user.setUserAge(userAge);
		User_tableDao.insert(user);
		System.out.println("----------------------------------------------------------------");
	}

	@Override
	public void deleteUserById(cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.deleteUserById.Input input,
			cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.deleteUserById.Output output) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------------------");
		String userid = input.getUserid();
		System.out.println("即将要删除的的userID : " + userid);
		User_tableDao.deleteOne_deleteOne(userid);
		System.out.println("删除成功");
		System.out.println("----------------------------------------------------------------");
		
	}

	@Override
	public void updateUserInfo(cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.updateUserInfo.Input input,
			cn.sunline.edsp.busi.adp.server.iobus.servicetype.UserInfo.updateUserInfo.Output output) {
		// TODO Auto-generated method stub
		String userid = input.getUserid();
		String userName = input.getUserName();
		String userAge = input.getUserAge();
		user_table user = SysUtil.getInstance(user_table.class);
		user.setUserid(userid);
		user.setUserName(userName);
		user.setUserAge(userAge);
		User_tableDao.updateOne_updeleteOne(user);
		
	}
	
	@Override
	public void selectOneUserById(Input input, Output output) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------------------------------------\r\n");
		String userid = input.getUserid();
		System.out.println("拿到userid");
		user_table one = User_tableDao.selectOne_selectOne(userid, false);
		System.out.println("查询到user");
		output.setUserid(one.getUserid());
		output.setUserName(one.getUserName());
		output.setUserAge(one.getUserAge());
		System.out.println("-------------------------------------------------------------------------\r\n");
	}


}

