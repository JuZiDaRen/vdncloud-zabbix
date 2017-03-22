package com.vdncloud.zabbix.item;

import java.util.List;

import com.vdncloud.zabbix.ZabbixApiResponse;

public class ItemDeleteResponse extends ZabbixApiResponse{

	private Result result;

	public ItemDeleteResponse() {
		super();
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
		private List<Integer> itemids;

		public Result(){
			
		}
		
		/**
		 * @return the itemids
		 */
		public List<Integer> getItemids() {
			return itemids;
		}

		/**
		 * @param itemids the itemids to set
		 */
		public void setItemids(List<Integer> itemids) {
			this.itemids = itemids;
		}
		
		
		
	}
	
}
