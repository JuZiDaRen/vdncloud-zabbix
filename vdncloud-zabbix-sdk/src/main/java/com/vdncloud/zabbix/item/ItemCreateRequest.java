package com.vdncloud.zabbix.item;

import com.vdncloud.zabbix.ZabbixApiRequest;

public class ItemCreateRequest extends ZabbixApiRequest{

	private Params params=new Params();
	
	public ItemCreateRequest() {
		setMethod("item.create");
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



public class Params extends ItemObject{
	   public Params(){
		   super();
	   }
   }
	  
	
	
}
