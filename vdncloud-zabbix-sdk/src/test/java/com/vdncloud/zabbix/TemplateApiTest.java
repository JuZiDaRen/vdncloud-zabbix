package com.vdncloud.zabbix;

import java.util.Date;

import org.junit.Test;

import com.vdncloud.zabbix.template.TemplateCreateRequest;
import com.vdncloud.zabbix.template.TemplateCreateResponse;
import com.vdncloud.zabbix.template.TemplateGetRequest;
import com.vdncloud.zabbix.template.TemplateGetResponse;

public class TemplateApiTest extends ZabbixApiTestBase{

	public TemplateApiTest() {
		super();
	}

	
//	@Test
//	public void create_test() throws ZabbixApiException{
//		
//		final Integer groupid=10;
//		
//		TemplateCreateRequest request=new TemplateCreateRequest();
//		
//		TemplateCreateRequest.Params params=request.getParams();
//		
//		params.addGroupId(groupid);
//		params.setHost("test.template.create."+new Date().getTime());
//		
//		
//		TemplateCreateResponse response=zabbixApi.template().create(request);
//		System.out.println(response.getResult().toString());
//		logger.debug(response.getResult().toString());
//		
//		
//	}
	
	
	@Test
	public void get_test() throws ZabbixApiException{
		TemplateGetRequest request=new TemplateGetRequest();
		
		TemplateGetResponse response=zabbixApi.template().get(request);
		
		System.out.println(response.getResult());
		
		
	}
	
	
	
}
