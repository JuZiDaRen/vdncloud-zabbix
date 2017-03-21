package com.vdncloud.zabbix.hostgroup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vdncloud.zabbix.ZabbixApiException;
import com.vdncloud.zabbix.ZabbixApiMethod;

public class Hostgroup extends ZabbixApiMethod{

	public Hostgroup(String apiUrl, String auth) {
		super(apiUrl, auth);
	}
	
	public HostgroupGetResponse get(HostgroupGetRequest request) throws ZabbixApiException {
		HostgroupGetResponse response=null;
		
		request.setAuth(auth);		
		
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		
		String  requestJson=gson.toJson(request);
		
		try{
			String responseJson=sendRequest(requestJson);
			
			response=gson.fromJson(responseJson, HostgroupGetResponse.class);
			
		}catch (ZabbixApiException e){
			throw new ZabbixApiException(e);
		}
		
		return response;				
		
	}
	
	

}
