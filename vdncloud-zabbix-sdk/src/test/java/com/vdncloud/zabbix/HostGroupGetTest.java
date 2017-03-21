package com.vdncloud.zabbix;

import org.junit.Test;

import com.vdncloud.zabbix.hostgroup.HostgroupGetRequest;
import com.vdncloud.zabbix.hostgroup.HostgroupGetResponse;

public class HostGroupGetTest extends ZabbixApiTestBase{

	public HostGroupGetTest() {
		super();
	}

	
	@Test
	public void testGet() throws Exception{
		
		HostgroupGetRequest request=new HostgroupGetRequest();
		HostgroupGetRequest.Params params=request.getParams();
		
	//	params.addHostId(10110);
		
		HostgroupGetResponse response=zabbixApi.hostgroup().get(request);
		
		
		System.out.println(getGson().toJson(response));
		
	  logger.debug(getGson().toJson(response));
		
	}
	
	
	
}
