package cn.sunline.edsp.busi.trans;
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
public class queryserialController{
	@PostMapping("/queryserial")
	@ApiOperation(value="/queryserial",notes="流水查询")
	public RestResponseData queryserial(@RequestBody RestRequestData request) {
		ResponseData response = RestUtils.execute(CommonDataUtil.requestToData(request));
		return CommonDataUtil.responseToData(response);
	}
}
