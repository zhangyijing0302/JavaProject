package cn.sunline.edsp.busi.servicetype;
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
public class CardInfoController{
    /**
     * 开卡
     *
     */
	@PostMapping("/cardInfo/createCard")
	@ApiOperation(value="/cardInfo/createCard",notes="开卡")
	public RestResponseData createCard(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
    /**
     * 卡状态检查
     *
     */
	@PostMapping("/cardInfo/checkCard")
	@ApiOperation(value="/cardInfo/checkCard",notes="卡状态检查")
	public RestResponseData checkCard(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
    /**
     * 卡信息查询
     *
     */
	@PostMapping("/cardInfo/queryCard")
	@ApiOperation(value="/cardInfo/queryCard",notes="卡信息查询")
	public RestResponseData queryCard(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
}
