package com.vdncloud.zabbix.hostgroup;

import java.util.ArrayList;

import com.vdncloud.zabbix.ZabbixApiResponse;

public class HostgroupGetResponse extends ZabbixApiResponse{

	private ArrayList<Result> result=new ArrayList<Result>();
	
	/**
	 * @return the result
	 */
	public ArrayList<Result> getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(ArrayList<Result> result) {
		this.result = result;
	}





	public HostgroupGetResponse() {
	}





	public class Result extends HostgroupObject{
		
	}
	
	
}
