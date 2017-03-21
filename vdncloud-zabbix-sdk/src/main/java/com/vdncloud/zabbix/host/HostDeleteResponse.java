package com.vdncloud.zabbix.host;

import java.util.ArrayList;
import java.util.List;

public class HostDeleteResponse {

	private Result result=new Result();
	
	public HostDeleteResponse() {
	
	}
	

	/**
	 * @return the result
	 */
	public Result getResult() {
		return result;
	}


	/**
	 * @param result the result to set
	 */
	public void setResult(Result result) {
		this.result = result;
	}





	public class Result{
		private List<Integer> hostids=new ArrayList<Integer>();
		
		public Result(){
			
		}
		
		public List<Integer> getHostids(){
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
