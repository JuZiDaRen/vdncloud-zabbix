package com.vdncloud.zabbix.hostgroup;

import com.vdncloud.zabbix.ZabbixApiRequest;
/**
 * 
 * @author JuZiDaRen
 *
 */
public class HostgroupCreateRequest extends ZabbixApiRequest{

	private Params params=new Params();
	
	public HostgroupCreateRequest() {
		setMethod("hostgroup.create");
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




	public class Params {
		private String name;
		
		public Params(){
			
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		
		
	}

	
	
}
