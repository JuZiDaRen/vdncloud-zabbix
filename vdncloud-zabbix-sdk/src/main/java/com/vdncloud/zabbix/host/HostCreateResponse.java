package com.vdncloud.zabbix.host;

import java.util.ArrayList;
import java.util.List;

import com.vdncloud.zabbix.ZabbixApiResponse;

public class HostCreateResponse extends ZabbixApiResponse{

	public HostCreateResponse() {
	    	
	}
    private Result result = new Result();

	 public Result getResult() {
	        return result;
	    }

	    public void setResult(Result result) {
	        this.result = result;
	    }
	
	public class Result {
		private List<Integer> hostids=new ArrayList<Integer>();
		
		public Result(){
			
		}

		/**
		 * @return the hostids
		 */
		public List<Integer> getHostids() {
			return hostids;
		}

		/**
		 * @param hostids the hostids to set
		 */
		public void setHostids(List<Integer> hostids) {
			this.hostids = hostids;
		}
		
		
		
	}
     
}
