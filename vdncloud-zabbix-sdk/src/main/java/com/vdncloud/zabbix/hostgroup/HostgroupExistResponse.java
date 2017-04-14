package com.vdncloud.zabbix.hostgroup;

import com.vdncloud.zabbix.ZabbixApiResponse;

public class HostgroupExistResponse extends ZabbixApiResponse{

	private boolean result;
	
	public HostgroupExistResponse() {
		super();
	}

	/**
	 * @return the result
	 */
	public boolean isResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(boolean result) {
		this.result = result;
	}
	
}
