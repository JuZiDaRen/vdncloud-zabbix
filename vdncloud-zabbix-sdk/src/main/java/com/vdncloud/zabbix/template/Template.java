package com.vdncloud.zabbix.template;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vdncloud.zabbix.ZabbixApiException;
import com.vdncloud.zabbix.ZabbixApiMethod;

public class Template extends ZabbixApiMethod{

	public Template(String apiUrl, String auth) {
		super(apiUrl, auth);
	}

	public TemplateCreateResponse create(TemplateCreateRequest request) throws ZabbixApiException{
		
		TemplateCreateResponse response=null;
		request.setAuth(auth);
		
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		
		String requestJson=gson.toJson(request);
		
		try{
			String responseJson=sendRequest(requestJson);
			response=gson.fromJson(responseJson, TemplateCreateResponse.class);
		}catch(ZabbixApiException e){
			throw new ZabbixApiException(e);
		}
		
		return response;
		
		
	}
	
	
	public TemplateGetResponse get(TemplateGetRequest request) throws ZabbixApiException{
		
		TemplateGetResponse response=null;
		request.setAuth(auth);
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		
		String requestJson=gson.toJson(request);
		
		
		try{
			String responseJson=sendRequest(requestJson);
			
			response=gson.fromJson(responseJson, TemplateGetResponse.class);
		}catch(ZabbixApiException e){
			throw new ZabbixApiException(e);
		}
		
		return response;
		
	}
	
	
	public TemplateUpdateResponse update(TemplateUpdateRequest request) throws ZabbixApiException {
        TemplateUpdateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, TemplateUpdateResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }
	
	
}
