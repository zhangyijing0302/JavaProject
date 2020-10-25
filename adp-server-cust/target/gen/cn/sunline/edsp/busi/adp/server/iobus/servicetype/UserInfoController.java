package cn.sunline.edsp.busi.adp.server.iobus.servicetype;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.sunline.adp.cedar.base.engine.ResponseData;
import cn.sunline.adp.cedar.protocol.rest.data.RestRequestData;
import cn.sunline.adp.cedar.protocol.rest.data.RestResponseData;
import cn.sunline.adp.cedar.protocol.rest.util.CommonDataUtil;
import cn.sunline.adp.cedar.protocol.rest.util.RestUtils;
import io.swagger.annotations.ApiOperation;
@RestController
public class UserInfoController{
    /**
     * 根据ID查询用户信息
     *
     */
	@PostMapping("/userInfo/selectOneUserById")
	@ApiOperation(value="/userInfo/selectOneUserById",notes="根据ID查询用户信息")
	public RestResponseData selectOneUserById(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
    /**
     * 删除用户
     *
     */
	@PostMapping("/userInfo/deleteUserById")
	@ApiOperation(value="/userInfo/deleteUserById",notes="删除用户")
	public RestResponseData deleteUserById(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
    /**
     * 更新用户信息
     *
     */
	@PostMapping("/userInfo/updateUserInfo")
	@ApiOperation(value="/userInfo/updateUserInfo",notes="更新用户信息")
	public RestResponseData updateUserInfo(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
    /**
     * 添加用户
     *
     */
	@PostMapping("/userInfo/insertUserInfo")
	@ApiOperation(value="/userInfo/insertUserInfo",notes="添加用户")
	public RestResponseData insertUserInfo(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
}
