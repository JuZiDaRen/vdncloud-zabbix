package com.vdncloud.zabbix.hostgroup;

public class HostgroupObject {
	private Integer groupid;
    private String name;	
	
	/**
	 * @return the groupid
	 */
	public Integer getGroupid() {
		return groupid;
	}
	/**
	 * @param groupid the groupid to set
	 */
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
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
