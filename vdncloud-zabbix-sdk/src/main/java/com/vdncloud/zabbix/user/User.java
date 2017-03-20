package com.vdncloud.zabbix.user;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vdncloud.zabbix.ZabbixApiException;
import com.vdncloud.zabbix.ZabbixApiMethod;
/**
 * 
 * @author JuZiDaRen
 *
 */
public class User extends ZabbixApiMethod{
       public User(String apiUrl){
    	   super(apiUrl, null);
       }
       
       public UserLoginResponse login(UserLoginRequest request) throws ZabbixApiException{
    	   UserLoginResponse response=null;
    	   
    	   Gson gson=new GsonBuilder().setPrettyPrinting().create();
    	   
    	   String requestJson=gson.toJson(request);
    	   
    	   try{
    		   
    		   String responseJson=sendRequest(requestJson);
    		   
    		   response=gson.fromJson(responseJson, UserLoginResponse.class);
    		   
    	   }catch(Exception e){
    		   throw new ZabbixApiException(e);
    	   }
    	   
    	   return response;
    	   
       }
       
       
}
