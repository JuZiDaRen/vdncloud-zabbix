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
	
	
	public HostgroupCreateResponse create(HostgroupCreateRequest request) throws ZabbixApiException {

        HostgroupCreateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, HostgroupCreateResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }
	
	
	/**
	 * 备注:3.0.3zabbix版本中该接口已废除，调用会报方法不存在
	 * @param request
	 * @return
	 * @throws ZabbixApiException
	 */
	public HostgroupExistResponse exist(HostgroupExistRequest request) throws ZabbixApiException {
        HostgroupExistResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);
System.out.println(requestJson);
        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, HostgroupExistResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }
	
	
	public HostgroupUpdateResponse update(HostgroupUpdateRequest request) throws ZabbixApiException {

        HostgroupUpdateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, HostgroupUpdateResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }
	

}
