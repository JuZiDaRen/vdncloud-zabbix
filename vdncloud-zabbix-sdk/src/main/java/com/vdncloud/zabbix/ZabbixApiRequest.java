package com.vdncloud.zabbix;

import java.util.Random;
/**
 * 
 * @author JuZiDaRen
 * @date 2017-03-17
 *
 */
public class ZabbixApiRequest {
	
	private Integer id = new Random().nextInt(Integer.MAX_VALUE);
    private String jsonrpc = "2.0";
    private String method;
    private String auth;
	
	
	    /**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the jsonrpc
	 */
	public String getJsonrpc() {
		return jsonrpc;
	}
	/**
	 * @param jsonrpc the jsonrpc to set
	 */
	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}
	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}
	/**
	 * @param method the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}
	/**
	 * @return the auth
	 */
	public String getAuth() {
		return auth;
	}
	/**
	 * @param auth the auth to set
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	    
	    
	    
	    
}
