package com.vdncloud.zabbix.item;

import java.util.ArrayList;
import java.util.List;

public class ItemUpdateResponse {

	
	private Result result=new Result();
	
	
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
		
		private List<Integer> itemids=new ArrayList<Integer>();

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
