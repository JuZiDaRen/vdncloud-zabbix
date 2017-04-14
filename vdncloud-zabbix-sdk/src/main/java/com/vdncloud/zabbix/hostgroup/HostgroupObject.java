package com.vdncloud.zabbix.hostgroup;

public class HostgroupObject {
	private Integer groupid;
    private String name;	
	
    private Integer flags;
    private Integer internal;
    
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
	/**
	 * @return the flags
	 */
	public Integer getFlags() {
		return flags;
	}
	/**
	 * @param flags the flags to set
	 */
	public void setFlags(Integer flags) {
		this.flags = flags;
	}
	/**
	 * @return the internal
	 */
	public Integer getInternal() {
		return internal;
	}
	/**
	 * @param internal the internal to set
	 */
	public void setInternal(Integer internal) {
		this.internal = internal;
	}		
	
	
	public static enum ORIGN_HOST_GROUP {
        PLAIN(0), DISCOVERED(4);
        public int value;

        private ORIGN_HOST_GROUP(int value) {
            this.value = value;
        }
    }

    public static enum INTERNALLY {
        NOT_INTERNAL(0), INTERNAL(1);
        public int value;

        private INTERNALLY(int value) {
            this.value = value;
        }

    }
	
}
