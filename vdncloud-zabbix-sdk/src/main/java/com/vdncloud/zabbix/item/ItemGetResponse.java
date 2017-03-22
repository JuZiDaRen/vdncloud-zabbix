package com.vdncloud.zabbix.item;

import java.util.ArrayList;
import java.util.List;

import com.vdncloud.zabbix.ZabbixApiResponse;

public class ItemGetResponse extends ZabbixApiResponse{
	
	List<Result> result=new ArrayList<Result>();
		
	public ItemGetResponse() {

	}

	/**
	 * @return the result
	 */
	public List<Result> getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(List<Result> result) {
		this.result = result;
	}


	public class Result extends ItemObject{
		
		public Result(){
			
		}
		
	}
	
	
}
