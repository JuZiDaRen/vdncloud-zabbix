package com.vdncloud.zabbix.item;

import com.vdncloud.zabbix.ZabbixApiRequest;

public class ItemUpdateRequest extends ZabbixApiRequest{
	
	private Params params=new Params();
	
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


	public ItemUpdateRequest() {
		setMethod("item.update");
	}
	
	
	public class Params extends ItemObject{
		public Params(){
			
		}
	}
	

	
	
	
	
}
