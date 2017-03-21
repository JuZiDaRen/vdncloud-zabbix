package com.vdncloud.zabbix.host;

import java.util.ArrayList;
import java.util.List;

import com.vdncloud.zabbix.ZabbixApiRequest;
import com.vdncloud.zabbix.util.ZbxListUtils;
/**
 * 
 * @author JuZiDaRen
 * @date 2017-03-21
 *
 */
public class HostDeleteRequest extends ZabbixApiRequest{
    
	private List<Integer> params=new ArrayList<Integer>();
	
	public HostDeleteRequest(){
		 setMethod("host.delete");
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

	public void addParams(int  hostid){
		this.params=ZbxListUtils.add(this.params, hostid);
	}


	
}
