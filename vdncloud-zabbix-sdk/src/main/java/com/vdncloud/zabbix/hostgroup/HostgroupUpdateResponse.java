package com.vdncloud.zabbix.hostgroup;

import java.util.ArrayList;

import com.vdncloud.zabbix.ZabbixApiResponse;

public class HostgroupUpdateResponse extends ZabbixApiResponse{

	private Result result=new Result();
	
	public HostgroupUpdateResponse() {
		
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
		private ArrayList<Integer> groupids=new ArrayList<Integer>();
		
		public Result(){
			
		}

		/**
		 * @return the groupids
		 */
		public ArrayList<Integer> getGroupids() {
			return groupids;
		}

		/**
		 * @param groupids the groupids to set
		 */
		public void setGroupids(ArrayList<Integer> groupids) {
			this.groupids = groupids;
		}
		
		
		
		
	}

	
	
}
