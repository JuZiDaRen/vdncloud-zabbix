package com.vdncloud.zabbix;
/**
 * 
 * @author JuZiDaRen
 * @date 2017-03-17
 *
 */
public class ZabbixApiException extends Exception{

	public ZabbixApiException() {
		super();
	}	

	public ZabbixApiException(String message) {
		super(message);
	}

	public ZabbixApiException(Throwable cause) {
		super(cause);
	}
       
}
