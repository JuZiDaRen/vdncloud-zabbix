package com.vdncloud.zabbix.item;

import java.util.ArrayList;
import java.util.List;

import com.vdncloud.zabbix.ZabbixApiRequest;

public class ItemDeleteRequest extends ZabbixApiRequest{
       
	   private List<Integer> params=new ArrayList<Integer>();   
	   
	   public ItemDeleteRequest() {
			setMethod("item.delete");
	   }

	/**
	 * @return the params
	 */
	public List<Integer> getParams() {
		return params;
	}

	/**
	 * @param params the params to set
	 */
	public void setParams(List<Integer> params) {
		this.params = params;
	}
	
	   
	   
}
