package com.vdncloud.zabbix;

import com.vdncloud.zabbix.host.Host;
import com.vdncloud.zabbix.hostgroup.Hostgroup;
import com.vdncloud.zabbix.item.Item;
import com.vdncloud.zabbix.user.User;
import com.vdncloud.zabbix.user.UserLoginRequest;
import com.vdncloud.zabbix.user.UserLoginResponse;

public class ZabbixApi {
	
       	
       private String apiUrl;
       private String auth;
       
       public ZabbixApi(String apiUrl){
    	   this.apiUrl=apiUrl;
       }
       
       
       public void login(String username,String password) throws ZabbixApiException{    	   
    	   User user=new User(this.apiUrl);
    	   UserLoginRequest request=new UserLoginRequest();
    	   request.getParams().setPassword(password);
    	   request.getParams().setUser(username);
    	   
    	   UserLoginResponse response=user.login(request);
    	   
    	   this.auth=response.getResult();
    	   
       }
       
       
       public Host host(){
    	   return new Host(apiUrl, auth);
       }
       
       
       public Hostgroup hostgroup() {

           return new Hostgroup(this.apiUrl, this.auth);
       }
       
       
       public Item item() {

           return new Item(this.apiUrl, this.auth);
       }
       
}
