package com.vdncloud.zabbix.item;

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
		
		private String search;
		
		public Params(){
			
		}

		/**
		 * @return the search
		 */
		public String getSearch() {
			return search;
		}

		/**
		 * @param search the search to set
		 */
		public void setSearch(String search) {
			this.search = search;
		}
		
		
	}
	
	
	
	

	
	
	
}
