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
		
		private List<Integer> templateids;
		
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
		 * @return the templateids
		 */
		public List<Integer> getTemplateids() {
			return templateids;
		}

		/**
		 * @param templateids the templateids to set
		 */
		public void setTemplateids(List<Integer> templateids) {
			this.templateids = templateids;
		}

		public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }
		
		public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }
				
		
		
	}

	
	
	
}
