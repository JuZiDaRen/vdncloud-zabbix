package com.vdncloud.zabbix.hostinterface;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vdncloud.zabbix.ZabbixApiException;
import com.vdncloud.zabbix.ZabbixApiMethod;

public class HostInterface extends ZabbixApiMethod{

	public HostInterface(String apiUrl, String auth) {
		super(apiUrl, auth);
	}
	
	public HostInterfaceGetResponse get(HostInterfaceGetRequest request) throws ZabbixApiException{
		HostInterfaceGetResponse response=null;
		request.setAuth(auth);
		
		Gson gson=new  GsonBuilder().setPrettyPrinting().create();
		
		String requestJson=gson.toJson(request);
		
		try{
			String responseJson=sendRequest(requestJson);
			response=gson.fromJson(responseJson, HostInterfaceGetResponse.class);
		}catch (Exception e){
			throw new ZabbixApiException(e);
		}
		
		
		return response;
		
	}
	
	

}
