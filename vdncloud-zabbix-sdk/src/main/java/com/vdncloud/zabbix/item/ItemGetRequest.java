package com.vdncloud.zabbix.item;

import java.util.List;

import com.google.gson.JsonObject;
import com.vdncloud.zabbix.ZabbixApiRequest;

public class ItemGetRequest extends ZabbixApiRequest{

	private Params params=new Params();
	
	
	public ItemGetRequest() {
		setMethod("item.get");
	}

	
	/**
	 * @return the params
	 */
	public Params getParams() {
		return params;
	}


	/**
	 * @param params the params to set
	 */
	public void setParams(Params params) {
		this.params = params;
	}


	public class Params{
		
		private JsonObject search;
		private List<Integer> hostids;
		private String output = "extend";
		
		public Params(){
			
		}
		
		
		

		/**
		 * @return the output
		 */
		public String getOutput() {
			return output;
		}


		/**
		 * @param output the output to set
		 */
		public void setOutput(String output) {
			this.output = output;
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




		/**
		 * @return the search
		 */
		public JsonObject getSearch() {
			return search;
		}




		/**
		 * @param search the search to set
		 */
		public void setSearch(JsonObject search) {
			this.search = search;
		}




		
		
		
	}
	
	
	
	

	
	
	
}
