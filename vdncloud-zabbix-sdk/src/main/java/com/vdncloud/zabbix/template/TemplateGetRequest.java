package com.vdncloud.zabbix.template;

import java.util.List;

import com.vdncloud.zabbix.ZabbixApiRequest;
import com.vdncloud.zabbix.util.ZbxListUtils;

public class TemplateGetRequest extends ZabbixApiRequest{

	private Params params=new Params();
	
	public TemplateGetRequest() {
		setMethod("template.get");
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
	
	
	private List<Integer> templateids;
	private List<Integer> groupids;
	private List<Integer> parentTemplateids;
	
	private List<Integer> hostids;
	private List<Integer> graphids;
	private List<Integer> itemids;
	private List<Integer> triggerids;
	
	 public void addTemplateId(Integer id) {
         templateids = ZbxListUtils.add(templateids, id);
     }

     public void addGroupId(Integer id) {
         groupids = ZbxListUtils.add(groupids, id);
     }

     public void addParentTemplateId(Integer id) {
         parentTemplateids = ZbxListUtils.add(parentTemplateids, id);
     }

     public void addHostId(Integer id) {
         hostids = ZbxListUtils.add(hostids, id);
     }

     public void addGraphId(Integer id) {
         graphids = ZbxListUtils.add(graphids, id);
     }

     public void addItemId(Integer id) {
         itemids = ZbxListUtils.add(itemids, id);
     }

     public void addTriggerId(Integer id) {
         triggerids = ZbxListUtils.add(triggerids, id);
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

	/**
	 * @return the groupids
	 */
	public List<Integer> getGroupids() {
		return groupids;
	}

	/**
	 * @param groupids the groupids to set
	 */
	public void setGroupids(List<Integer> groupids) {
		this.groupids = groupids;
	}

	/**
	 * @return the parentTemplateids
	 */
	public List<Integer> getParentTemplateids() {
		return parentTemplateids;
	}

	/**
	 * @param parentTemplateids the parentTemplateids to set
	 */
	public void setParentTemplateids(List<Integer> parentTemplateids) {
		this.parentTemplateids = parentTemplateids;
	}

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
	 * @return the graphids
	 */
	public List<Integer> getGraphids() {
		return graphids;
	}

	/**
	 * @param graphids the graphids to set
	 */
	public void setGraphids(List<Integer> graphids) {
		this.graphids = graphids;
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
