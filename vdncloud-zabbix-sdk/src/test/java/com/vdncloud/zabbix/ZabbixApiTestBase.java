package com.vdncloud.zabbix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static org.junit.Assert.fail;
public class ZabbixApiTestBase {
    protected static Logger logger=LoggerFactory.getLogger(ZabbixApiTestBase.class);
    protected String user="Admin";
    protected String password="zabbix";
    
    protected ZabbixApi zabbixApi;
    
    public ZabbixApiTestBase(){
    	login(user, password);
    }
    
    protected void login(String user,String password){
    	try{
    		zabbixApi = new ZabbixApi("http://192.168.31.188/zabbix/api_jsonrpc.php");
    	//	zabbixApi = new ZabbixApi("http://monitor.vdncloud.com:62947/zabbix/api_jsonrpc.php");
            zabbixApi.login(user, password);
    	}catch(Exception e){
    		fail(e.getMessage());
    	}
    }
    
    protected Gson getGson(){
    	return new GsonBuilder().setPrettyPrinting().create();
    }
    
    

}
