package com.vdncloud.zabbix.item;

import com.vdncloud.zabbix.ZabbixApiParamter;
/**
 * 
 * @author JuZiDaRen
 * @date 2017-03-21
 *
 */
public class ItemObject {
     private Integer itemid;
     private Integer delay=ZabbixApiParamter.ITEM_DELAY_DEFAULT;
     private Integer hostid;
     private Integer  interfaceid;
     private String key_;
     private String name;
     private Integer type;
     private Integer value_type;
     
     private Long lastclock;
     private Integer lastns;
     private String lastvalue;
     private String prevalue;
     private String units;
     private Integer status;
     private Integer lifetime;
     private Integer history;
     private String description;
     
	/**
	 * @return the itemid
	 */
	public Integer getItemid() {
		return itemid;
	}
	/**
	 * @param itemid the itemid to set
	 */
	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}
	/**
	 * @return the delay
	 */
	public Integer getDelay() {
		return delay;
	}
	/**
	 * @param delay the delay to set
	 */
	public void setDelay(Integer delay) {
		this.delay = delay;
	}
	/**
	 * @return the hostid
	 */
	public Integer getHostid() {
		return hostid;
	}
	/**
	 * @param hostid the hostid to set
	 */
	public void setHostid(Integer hostid) {
		this.hostid = hostid;
	}
	/**
	 * @return the interfaceid
	 */
	public Integer getInterfaceid() {
		return interfaceid;
	}
	/**
	 * @param interfaceid the interfaceid to set
	 */
	public void setInterfaceid(Integer interfaceid) {
		this.interfaceid = interfaceid;
	}
	/**
	 * @return the key_
	 */
	public String getKey_() {
		return key_;
	}
	/**
	 * @param key_ the key_ to set
	 */
	public void setKey_(String key_) {
		this.key_ = key_;
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
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * @return the value_type
	 */
	public Integer getValue_type() {
		return value_type;
	}
	/**
	 * @param value_type the value_type to set
	 */
	public void setValue_type(Integer value_type) {
		this.value_type = value_type;
	}
	/**
	 * @return the lastclock
	 */
	public Long getLastclock() {
		return lastclock;
	}
	/**
	 * @param lastclock the lastclock to set
	 */
	public void setLastclock(Long lastclock) {
		this.lastclock = lastclock;
	}
	/**
	 * @return the lastns
	 */
	public Integer getLastns() {
		return lastns;
	}
	/**
	 * @param lastns the lastns to set
	 */
	public void setLastns(Integer lastns) {
		this.lastns = lastns;
	}
	/**
	 * @return the lastvalue
	 */
	public String getLastvalue() {
		return lastvalue;
	}
	/**
	 * @param lastvalue the lastvalue to set
	 */
	public void setLastvalue(String lastvalue) {
		this.lastvalue = lastvalue;
	}
	/**
	 * @return the prevalue
	 */
	public String getPrevalue() {
		return prevalue;
	}
	/**
	 * @param prevalue the prevalue to set
	 */
	public void setPrevalue(String prevalue) {
		this.prevalue = prevalue;
	}
	/**
	 * @return the units
	 */
	public String getUnits() {
		return units;
	}
	/**
	 * @param units the units to set
	 */
	public void setUnits(String units) {
		this.units = units;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the lifetime
	 */
	public Integer getLifetime() {
		return lifetime;
	}
	/**
	 * @param lifetime the lifetime to set
	 */
	public void setLifetime(Integer lifetime) {
		this.lifetime = lifetime;
	}
	/**
	 * @return the history
	 */
	public Integer getHistory() {
		return history;
	}
	/**
	 * @param history the history to set
	 */
	public void setHistory(Integer history) {
		this.history = history;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}	
	
	
	
	
     
}
