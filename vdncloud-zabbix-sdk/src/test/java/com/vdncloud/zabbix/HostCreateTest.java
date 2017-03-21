package com.vdncloud.zabbix;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.vdncloud.zabbix.host.HostCreateRequest;
import com.vdncloud.zabbix.host.HostCreateResponse;
import com.vdncloud.zabbix.host.HostDeleteRequest;
import com.vdncloud.zabbix.host.HostDeleteResponse;
import com.vdncloud.zabbix.hostinterface.HostInterfaceObject;

public class HostCreateTest extends ZabbixApiTestBase{
	
	public HostCreateTest() {
        super();
    }
	
	/**
	 * host create test
	 */
//	@Test
//	public void testCreate(){
//		final Integer groupId=85;
//		final Integer templateId=10672;
//		
//		try{
//			
//			HostCreateRequest request=new HostCreateRequest();
//			HostCreateRequest.Params params=request.getParams();
//			
//			params.addTemplateId(templateId);
//			params.addGroupId(groupId);
//			
//			HostInterfaceObject hostInterface=new HostInterfaceObject();
//			hostInterface.setIp("192.168.255.255");
//			params.addHostInterfaceObject(hostInterface);
//			
//			params.setHost("test host create1."+new Date().getTime());
//			params.setName("test host created1 name"+new Date().getTime());
//			
//			
//			HostCreateResponse response=zabbixApi.host().create(request);
//			
//			assertNotNull(response);
//			
//			int hostId=response.getResult().getHostids().get(0);
//			System.out.println(hostId);
//			assertTrue(0<hostId);
//			
//		} catch (Exception e){
//			e.printStackTrace();
//			//fail(e.getMessage());
//		}
//		
//		
//	}
	
	/**
	 * host delete test
	 */
	@Test
	public void testDelete() throws Exception{	
		
		int hostId=10108;
		
		  HostDeleteRequest request=new HostDeleteRequest();
		  request.addParams(hostId);
		  
		  HostDeleteResponse response=zabbixApi.host().delete(request);
		  
		  int deleteId=response.getResult().getHostids().get(0);
		System.out.println(deleteId);
		  assertEquals(hostId, deleteId);
		  
	}	
	
	
}
