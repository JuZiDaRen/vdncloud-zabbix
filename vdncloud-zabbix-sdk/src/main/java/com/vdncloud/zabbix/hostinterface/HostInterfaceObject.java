package com.vdncloud.zabbix.hostinterface;

import com.vdncloud.zabbix.ZabbixApiParamter;

/**
 * 
 * @author JuZiDaRen
 *
 */
public class HostInterfaceObject {
	
	private Integer interfaceid;
    private String dns="";
    private Integer hostid;
    private String ip;
    
    private Integer main = 1;
    private Integer port = ZabbixApiParamter.ZABBIX_CLIENT_DEFAULT_PORT;
    private Integer type = ZabbixApiParamter.HOST_INTERFACE_TYPE.AGENT.value;
    private Integer useip = ZabbixApiParamter.HOST_AGENT_ACCESS_INTERFACE.IP_ADDRESS.value;
	
	
       /**
	 * @return the interfaceid
	 */
	public Integer getInterfaceid() {
		return interfaceid;
	}
	/**
	 * @param interfaceid the interfaceid to set
	 */
	public void setInterfaceid(Integer interfaceid) {
		this.interfaceid = interfaceid;
	}
	/**
	 * @return the dns
	 */
	public String getDns() {
		return dns;
	}
	/**
	 * @param dns the dns to set
	 */
	public void setDns(String dns) {
		this.dns = dns;
	}
	/**
	 * @return the hostid
	 */
	public Integer getHostid() {
		return hostid;
	}
	/**
	 * @param hostid the hostid to set
	 */
	public void setHostid(Integer hostid) {
		this.hostid = hostid;
	}
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * @return the main
	 */
	public Integer getMain() {
		return main;
	}
	/**
	 * @param main the main to set
	 */
	public void setMain(Integer main) {
		this.main = main;
	}
	/**
	 * @return the port
	 */
	public Integer getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(Integer port) {
		this.port = port;
	}
	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * @return the useip
	 */
	public Integer getUseip() {
		return useip;
	}
	/**
	 * @param useip the useip to set
	 */
	public void setUseip(Integer useip) {
		this.useip = useip;
	}

    
	
	
	
	
       
       
       
       
}
