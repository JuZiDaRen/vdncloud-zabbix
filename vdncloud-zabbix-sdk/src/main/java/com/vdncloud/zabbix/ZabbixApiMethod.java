package com.vdncloud.zabbix;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.vdncloud.zabbix.json.JSONException;
import com.vdncloud.zabbix.json.JSONObject;

/**
 * 
 * @author JuZiDaRen
 * @date 2017-03-17
 *
 */
public class ZabbixApiMethod {
	
     private static Logger logger=LoggerFactory.getLogger(ZabbixApiMethod.class);
     
     protected String apiUrl;
     
     protected String auth;

	public ZabbixApiMethod(String apiUrl, String auth) {
		this.apiUrl = apiUrl;
		this.auth = auth;
	}
     
     public String sendRequest(String reqJson) throws ZabbixApiException{
    	 
    	 HttpResponse resp;
    	 
    	 HttpPost httpPost=new HttpPost(apiUrl);
    	 
    	 String respBody=null;
    	 
    	 try{
    		 
    		 httpPost.setHeader("Content-Type", "application/json-rpc");
    		 httpPost.setEntity(new StringEntity(reqJson));
    		 
    		 DefaultHttpClient client=new DefaultHttpClient();
    		 resp=client.execute(httpPost);
    		 respBody=EntityUtils.toString(resp.getEntity());
    		 
    	 }catch (Exception ex){
    		 throw new ZabbixApiException("http request error");
    	 }
    	 
    	 if(resp.getStatusLine().getStatusCode()!=HttpStatus.SC_OK){
             throw new ZabbixApiException("HTTP Error : " + respBody);
    	 }
    	 
    	JSONObject respJson;
    	 try{
    		 respJson=new JSONObject(respBody);
    	 }catch(Exception ex){
    		 throw new ZabbixApiException(ex.getMessage()); 
    	 }
    	 
    	 if(respJson.has("error")){
    		 String msg;
    		 try{
    			 msg="API Error :"+respJson.getJSONObject("error").toString();
    		 }catch(JSONException e){
    			 throw new ZabbixApiException(e.getMessage());
    		 }
    		 msg+="\nRequest:"+reqJson.toString();
    		 throw new ZabbixApiException(msg);
    	 }
    	 
    	 Gson gson=new Gson();
    	 
    	 ZabbixApiRequest zabbixreq=gson.fromJson(reqJson, ZabbixApiRequest.class);
    	 ZabbixApiResponse zabbixresp=gson.fromJson(respBody, ZabbixApiResponse.class);
    	 if(zabbixreq.getId().equals(zabbixresp.getId())==false){
    		 throw new ZabbixApiException("not match");
    	 }
    	 return respBody;
     }
     
     
     
}
