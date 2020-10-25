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
public class CustInfoController{
    /**
     * Create customer information
     *
     */
	@PostMapping("/custInfo/createCust")
	@ApiOperation(value="/custInfo/createCust",notes="Create customer information")
	public RestResponseData createCust(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
    /**
     * 客户信息查询
     *
     */
	@PostMapping("/custInfo/queryCust")
	@ApiOperation(value="/custInfo/queryCust",notes="客户信息查询")
	public RestResponseData queryCust(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
}
