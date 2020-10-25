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
public class AcctInfoController{
    /**
     * Create account information
     *
     */
	@PostMapping("/acctInfo/createAcct")
	@ApiOperation(value="/acctInfo/createAcct",notes="Create account information")
	public RestResponseData createAcct(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
    /**
     * 账户消费
     *
     */
	@PostMapping("/acctInfo/consumeAcct")
	@ApiOperation(value="/acctInfo/consumeAcct",notes="账户消费")
	public RestResponseData consumeAcct(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
    /**
     * 查询账户信息
     *
     */
	@PostMapping("/acctInfo/queryAcct")
	@ApiOperation(value="/acctInfo/queryAcct",notes="查询账户信息")
	public RestResponseData queryAcct(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
    /**
     * 消费流水查询
     *
     */
	@PostMapping("/acctInfo/queryComSerial")
	@ApiOperation(value="/acctInfo/queryComSerial",notes="消费流水查询")
	public RestResponseData queryComSerial(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
}
