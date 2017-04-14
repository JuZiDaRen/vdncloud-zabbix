package com.vdncloud.zabbix.hostgroup;

import java.util.ArrayList;

import com.vdncloud.zabbix.ZabbixApiRequest;
/**
 * 
 * @author JuZiDaRen 2017-04-13
 *
 */
public class HostgroupExistRequest extends ZabbixApiRequest{

	private Params params=new Params();
	
	public HostgroupExistRequest() {
		setMethod("hostgroup.exists");
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
		
		//private ArrayList<Integer> groupid=new ArrayList<Integer>();
		
		private String name;
		
		private String node;
		
	//	private ArrayList<String> nodeids=new ArrayList<String>();
		
		public Params(){
			
		}

//		/**
//		 * @return the groupid
//		 */
//		public ArrayList<Integer> getGroupid() {
//			return groupid;
//		}
//
//		/**
//		 * @param groupid the groupid to set
//		 */
//		public void setGroupid(ArrayList<Integer> groupid) {
//			this.groupid = groupid;
//		}

		

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
		 * @return the node
		 */
		public String getNode() {
			return node;
		}

		/**
		 * @param node the node to set
		 */
		public void setNode(String node) {
			this.node = node;
		}

//		/**
//		 * @return the nodeids
//		 */
//		public ArrayList<String> getNodeids() {
//			return nodeids;
//		}
//
//		/**
//		 * @param nodeids the nodeids to set
//		 */
//		public void setNodeids(ArrayList<String> nodeids) {
//			this.nodeids = nodeids;
//		}
		
		
		
		
		
	}
	

	
	
}
