package com.vdncloud.zabbix.hostinterface;

import java.util.List;

import com.vdncloud.zabbix.ZabbixApiRequest;

public class HostInterfaceGetRequest extends ZabbixApiRequest{

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



	public HostInterfaceGetRequest(){
		setMethod("hostinterface.get");
	}
	
	
	
	public class Params{
		
		private List<Integer> hostids;
		private List<Integer> interfaceids;
		private List<Integer> itemids;
		private List<Integer> triggerids;
		
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
		 * @return the interfaceids
		 */
		public List<Integer> getInterfaceids() {
			return interfaceids;
		}
		/**
		 * @param interfaceids the interfaceids to set
		 */
		public void setInterfaceids(List<Integer> interfaceids) {
			this.interfaceids = interfaceids;
		}
		/**
		 * @return the itemids
		 */
		public List<Integer> getItemids() {
			return itemids;
		}
		/**
		 * @param itemids the itemids to set
		 */
		public void setItemids(List<Integer> itemids) {
			this.itemids = itemids;
		}
		/**
		 * @return the triggerids
		 */
		public List<Integer> getTriggerids() {
			return triggerids;
		}
		/**
		 * @param triggerids the triggerids to set
		 */
		public void setTriggerids(List<Integer> triggerids) {
			this.triggerids = triggerids;
		}
		
		
		
		
		
	}
	
}
