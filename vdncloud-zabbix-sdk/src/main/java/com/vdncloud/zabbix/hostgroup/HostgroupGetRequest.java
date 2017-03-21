package com.vdncloud.zabbix.hostgroup;

import java.util.List;

import com.vdncloud.zabbix.ZabbixApiRequest;
import com.vdncloud.zabbix.util.ZbxListUtils;

public class HostgroupGetRequest extends ZabbixApiRequest{

	private Params params=new Params();
	
	
	public HostgroupGetRequest() {
		setMethod("hostgroup.get");
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
		private List<Integer> hostids;

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
		
		public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }
		
		
	}

	
	
	
}
