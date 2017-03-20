package com.vdncloud.zabbix.hostinterface;

import java.util.ArrayList;
import java.util.List;
import com.vdncloud.zabbix.ZabbixApiResponse;

public class HostInterfaceGetResponse extends ZabbixApiResponse{
      
	private List<Result> result=new ArrayList<Result>();	
		
	public HostInterfaceGetResponse() {
		super();
	}

	/**
	 * @return the result
	 */
	public List<Result> getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(List<Result> result) {
		this.result = result;
	}


	public class Result extends HostInterfaceObject {
		public Result(){
			super();
		}
	}
}
