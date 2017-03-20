package com.vdncloud.zabbix.host;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vdncloud.zabbix.ZabbixApiException;
import com.vdncloud.zabbix.ZabbixApiMethod;


public class Host extends ZabbixApiMethod{

	public Host(String apiUrl, String auth) {
		super(apiUrl, auth);
	}

	public HostCreateResponse create(HostCreateRequest request) throws ZabbixApiException {
        HostCreateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, HostCreateResponse.class);
        } catch (Exception e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }
	
}
