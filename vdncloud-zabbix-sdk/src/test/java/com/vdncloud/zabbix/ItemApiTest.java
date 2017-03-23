package com.vdncloud.zabbix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.JsonObject;
import com.vdncloud.zabbix.item.ItemCreateRequest;
import com.vdncloud.zabbix.item.ItemCreateResponse;
import com.vdncloud.zabbix.item.ItemDeleteRequest;
import com.vdncloud.zabbix.item.ItemDeleteResponse;
import com.vdncloud.zabbix.item.ItemGetRequest;
import com.vdncloud.zabbix.item.ItemGetResponse;
import com.vdncloud.zabbix.item.ItemUpdateRequest;
import com.vdncloud.zabbix.item.ItemUpdateResponse;

public class ItemApiTest extends ZabbixApiTestBase{

	public ItemApiTest() {
		super();
	}

//	@Test
//	public void createTest() throws Exception {
//		
//		ItemCreateRequest request=new ItemCreateRequest();
//		ItemCreateRequest.Params params=request.getParams();
//		
//		params.setName("Test-Item");
//		params.setDelay(60);
//		params.setHostid(10110);
//		params.setKey_("agent.hostname");
//		params.setValue_type(ZabbixApiParamter.ITEM_VALUE_TYPE.CHARACTOR.value);
//		params.setType(0);
//		params.setInterfaceid(19);
//		
//		ItemCreateResponse response=zabbixApi.item().create(request);
//		
//		logger.debug(getGson().toJson(response));		
//				
//		
//	}
	
//	@Test
//	public void deleteTest() throws Exception{
//		
//		ItemDeleteRequest request=new ItemDeleteRequest();
//		ArrayList<Integer> params=new ArrayList<Integer>();
//		params.add(23668);
//		request.setParams(params);
//		
//		ItemDeleteResponse response=zabbixApi.item().delete(request);
//		
//		logger.debug(getGson().toJson(response));	
//		
//	}
	
//	@Test
//	public void getTest() throws Exception{
//		
//		ItemGetRequest request=new ItemGetRequest();
//		
//		ItemGetRequest.Params params=request.getParams();
//		
//		JsonObject json=new JsonObject();
//		json.addProperty("key_", "ram_active");
//		
//		ArrayList<Integer> hostids=new ArrayList<Integer>();
//		hostids.add(10509);
//		
//		params.setSearch(json);
//		params.setHostids(hostids);
//		ItemGetResponse response=zabbixApi.item().get(request);
//		
//		System.out.println(response.getResult());
//		
//	}
	
	
	@Test
	public void updateTest() throws Exception{
		
		ItemUpdateRequest request=new ItemUpdateRequest();
		ItemUpdateRequest.Params params=request.getParams();
		
		
		params.setItemid(23669);
		
		params.setDescription("呵呵111");
		params.setName("test-123");
		
		ItemUpdateResponse response=zabbixApi.item().update(request);	
		
		System.out.println(getGson().toJson(response));
		
	}
	
	
	
	
	
}
