package com.vdncloud.zabbix.host;

import com.vdncloud.zabbix.ZabbixApiParamter;

public class HostObject {

	private Integer hostid;
    private Integer proxy_hostid;
    private String host;
    private Integer status = ZabbixApiParamter.HOST_MONITOR_STATUS.MONITORED_HOST.value;
    private String name;
    
    public HostObject() {
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
	 * @return the proxy_hostid
	 */
	public Integer getProxy_hostid() {
		return proxy_hostid;
	}

	/**
	 * @param proxy_hostid the proxy_hostid to set
	 */
	public void setProxy_hostid(Integer proxy_hostid) {
		this.proxy_hostid = proxy_hostid;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
    
    
    
	
}
