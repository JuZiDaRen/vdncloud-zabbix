package com.vdncloud.zabbix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

import com.vdncloud.zabbix.template.TemplateCreateRequest;
import com.vdncloud.zabbix.template.TemplateCreateResponse;
import com.vdncloud.zabbix.template.TemplateGetRequest;
import com.vdncloud.zabbix.template.TemplateGetResponse;
import com.vdncloud.zabbix.template.TemplateUpdateRequest;
import com.vdncloud.zabbix.template.TemplateUpdateResponse;

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
//	
//	
//	@Test
//	public void get_test() throws ZabbixApiException{
//		TemplateGetRequest request=new TemplateGetRequest();
//		request.getParams().setTemplateids(new ArrayList<Integer>(Arrays.asList(new Integer[]{10106})));
//		TemplateGetResponse response=zabbixApi.template().get(request);
//		
//		System.out.println(response.getResult());
//				
//	}
	
	
	
	
	@Test
	public void update_test() throws ZabbixApiException{
		
		TemplateUpdateRequest request = new TemplateUpdateRequest();
        TemplateUpdateRequest.Params params = request.getParams();
        params.setTemplateid(10106);
        params.setName("Test");
        params.addGroupId(14);
        params.addGroupId(1);
        params.addGroupId(8);
        TemplateUpdateResponse response = zabbixApi.template().update(request);
        
        Integer actualId = response.getResult().getTemplateids().get(0);
        
        System.out.println(actualId);
        
	}
	
	
	
	
	
	
}
