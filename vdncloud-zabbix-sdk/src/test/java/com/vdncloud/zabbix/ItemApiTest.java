package com.vdncloud.zabbix;

import org.junit.Test;

import com.vdncloud.zabbix.item.ItemCreateRequest;
import com.vdncloud.zabbix.item.ItemCreateResponse;

public class ItemApiTest extends ZabbixApiTestBase{

	public ItemApiTest() {
		super();
	}

	@Test
	public void createTest() throws Exception {
		
		ItemCreateRequest request=new ItemCreateRequest();
		ItemCreateRequest.Params params=request.getParams();
		
		params.setName("Test-Item");
		params.setDelay(60);
		params.setHostid(10110);
		params.setKey_("agent.hostname");
		params.setValue_type(ZabbixApiParamter.ITEM_VALUE_TYPE.CHARACTOR.value);
		params.setType(0);
		params.setInterfaceid(19);
		
		ItemCreateResponse response=zabbixApi.item().create(request);
		
		logger.debug(getGson().toJson(response));
		
		
		
		
	}
	
}
