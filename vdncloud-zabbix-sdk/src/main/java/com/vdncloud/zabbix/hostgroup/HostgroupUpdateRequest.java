package com.vdncloud.zabbix.hostgroup;

import com.vdncloud.zabbix.ZabbixApiRequest;

public class HostgroupUpdateRequest extends ZabbixApiRequest{

	private Params params=new Params();
	
	public HostgroupUpdateRequest() {
		setMethod("hostgroup.update");
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
    	private int groupid;
    	
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

		/**
		 * @return the groupid
		 */
		public int getGroupid() {
			return groupid;
		}

		/**
		 * @param groupid the groupid to set
		 */
		public void setGroupid(int groupid) {
			this.groupid = groupid;
		}
    	
    	
    	
    }
	
	
}
