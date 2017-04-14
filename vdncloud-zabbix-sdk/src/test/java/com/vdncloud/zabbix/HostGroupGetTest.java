package com.vdncloud.zabbix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.vdncloud.zabbix.hostgroup.HostgroupCreateRequest;
import com.vdncloud.zabbix.hostgroup.HostgroupCreateResponse;
import com.vdncloud.zabbix.hostgroup.HostgroupExistRequest;
import com.vdncloud.zabbix.hostgroup.HostgroupExistResponse;
import com.vdncloud.zabbix.hostgroup.HostgroupGetRequest;
import com.vdncloud.zabbix.hostgroup.HostgroupGetResponse;
import com.vdncloud.zabbix.hostgroup.HostgroupUpdateRequest;
import com.vdncloud.zabbix.hostgroup.HostgroupUpdateResponse;




public class HostGroupGetTest extends ZabbixApiTestBase{

	public HostGroupGetTest() {
		super();
	}

	
//	@Test
//	public void testGet() throws Exception{
//		
//		HostgroupGetRequest request=new HostgroupGetRequest();
//		HostgroupGetRequest.Params params=request.getParams();
//		
//	//	params.addHostId(10110);
//		
//		HostgroupGetResponse response=zabbixApi.hostgroup().get(request);
//		
//		
//		System.out.println(getGson().toJson(response));
//		
//	    logger.debug(getGson().toJson(response));
//		
//	}
	
	private HostgroupCreateResponse hostgroupCreateResponse;
	
//	@Test
//	public void createTest() throws Exception{
//		
//		String name = "test_hostgroup_create1";
//        HostgroupCreateRequest request = new HostgroupCreateRequest();
//        request.getParams().setName(name);
//
//        try {
//            hostgroupCreateResponse = zabbixApi.hostgroup().create(request);
//
//            assertNotNull(hostgroupCreateResponse);
//
//            assertNotNull(hostgroupCreateResponse.getResult().getGroupids());
//
//            assertTrue(0 < hostgroupCreateResponse.getResult().getGroupids().size());
//        } catch (ZabbixApiException e) {
//            fail(e.getMessage());
//        }
//		
//	}
	
//	   @Test
//	    public void testExist1() {
//
//	        HostgroupExistRequest request = new HostgroupExistRequest();
//	        request.getParams().setName("Linux servers");
//	   //     request.getParams().setNodeids(new ArrayList<String>(Arrays.asList(new String[]{"1"})));
//	        try {
//	            HostgroupExistResponse response = zabbixApi.hostgroup().exist(request);
//                
//	            assertNotNull(response);
//                
//	            assertTrue(response.isResult());
//	        } catch (ZabbixApiException e) {
//	            fail(e.getMessage());
//	        }
//	    }
	
	@Test
	   public void testUpdate1() {

	        int targetGroupid = 9;
	        String name = "test_hostgroup_update1";
	        HostgroupUpdateRequest request = new HostgroupUpdateRequest();
	        request.getParams().setName(name);
	        request.getParams().setGroupid(targetGroupid);

	        try {
	            HostgroupUpdateResponse response = zabbixApi.hostgroup().update(request);

	            assertNotNull(response);

	            assertNotNull(response.getResult().getGroupids());

	            int groupId = response.getResult().getGroupids().get(0);
	            assertEquals(targetGroupid, groupId);
	        } catch (ZabbixApiException e) {
	            fail(e.getMessage());
	        }
	    }
	
	   
	   
	
	
}
