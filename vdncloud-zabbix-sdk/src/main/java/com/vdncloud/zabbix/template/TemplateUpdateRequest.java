package com.vdncloud.zabbix.template;

import java.util.List;

import com.vdncloud.zabbix.ZabbixApiRequest;
import com.vdncloud.zabbix.host.HostObject;
import com.vdncloud.zabbix.hostgroup.HostgroupObject;
import com.vdncloud.zabbix.util.ZbxListUtils;
/**
 * 
 * @author JuZiDaRen 2017-04-18
 *
 */
public class TemplateUpdateRequest extends ZabbixApiRequest{

	private Params params=new Params();
	
	public TemplateUpdateRequest() {
		setMethod("template.update");
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





	public class Params extends TemplateObject{
		private List<HostgroupObject> groups;
		private List<HostObject> hosts;
		private List<TemplateObject> templates;
		private List<TemplateObject> templates_clear;
		
		
		public void addGroupId(Integer id){
			
			HostgroupObject obj=new HostgroupObject();
			obj.setGroupid(id);
			groups=ZbxListUtils.add(groups, obj);
			
		}
		
		
		public void addTemplateId(Integer id){
			TemplateObject obj=new TemplateObject();
			obj.setTemplateid(id);
			templates=ZbxListUtils.add(templates, obj);
		}
		
		public void addClearTemplate(Integer id){
			TemplateObject obj=new TemplateObject();
			obj.setTemplateid(id);
			templates_clear=ZbxListUtils.add(templates_clear, obj);
		}


		/**
		 * @return the groups
		 */
		public List<HostgroupObject> getGroups() {
			return groups;
		}


		/**
		 * @param groups the groups to set
		 */
		public void setGroups(List<HostgroupObject> groups) {
			this.groups = groups;
		}


		/**
		 * @return the hosts
		 */
		public List<HostObject> getHosts() {
			return hosts;
		}


		/**
		 * @param hosts the hosts to set
		 */
		public void setHosts(List<HostObject> hosts) {
			this.hosts = hosts;
		}


		/**
		 * @return the templates
		 */
		public List<TemplateObject> getTemplates() {
			return templates;
		}


		/**
		 * @param templates the templates to set
		 */
		public void setTemplates(List<TemplateObject> templates) {
			this.templates = templates;
		}


		/**
		 * @return the templates_clear
		 */
		public List<TemplateObject> getTemplates_clear() {
			return templates_clear;
		}


		/**
		 * @param templates_clear the templates_clear to set
		 */
		public void setTemplates_clear(List<TemplateObject> templates_clear) {
			this.templates_clear = templates_clear;
		}
		
		
		
		
	}
	
	

	
	
}
