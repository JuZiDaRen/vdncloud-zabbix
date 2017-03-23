package com.vdncloud.zabbix.item;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vdncloud.zabbix.ZabbixApiException;
import com.vdncloud.zabbix.ZabbixApiMethod;
/**
 * 
 * @author JuZiDaRen
 * @date 2017-03-21
 *
 */
public class Item extends ZabbixApiMethod{

	public Item(String apiUrl, String auth) {
		super(apiUrl, auth);
	}
	
	
	public ItemCreateResponse create(ItemCreateRequest request) throws ZabbixApiException {
		ItemCreateResponse response=null;
		
		request.setAuth(auth);
		
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		
		String requestJson=gson.toJson(request);
		
		try{
			
			String responseJson=sendRequest(requestJson);
			
			response=gson.fromJson(responseJson, ItemCreateResponse.class);
			
			
			
		}catch(Exception e){
			throw new ZabbixApiException(e);
		}
		
		return response;
		
	}
	
	public ItemDeleteResponse delete(ItemDeleteRequest request) throws ZabbixApiException{
		ItemDeleteResponse response=null;
		request.setAuth(auth);
		
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		
		String requestJson=gson.toJson(request);
		
		try{
			String responseJson=sendRequest(requestJson);
			
			response=gson.fromJson(responseJson, ItemDeleteResponse.class);
		} catch(ZabbixApiException e){
			throw new ZabbixApiException(e);
		}
		
		return response;
		
		
		
	}
	
	
	public ItemGetResponse get(ItemGetRequest request) throws ZabbixApiException{
		
		ItemGetResponse response=null;
		
		request.setAuth(auth);
		
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		
		String reuqestJson=gson.toJson(request);

		try{
			String responseJson=sendRequest(reuqestJson);
			response=gson.fromJson(responseJson, ItemGetResponse.class);
			
		}catch (ZabbixApiException e){
			throw new ZabbixApiException(e);
		}
		
		return response;
		
	}
	
	

}
