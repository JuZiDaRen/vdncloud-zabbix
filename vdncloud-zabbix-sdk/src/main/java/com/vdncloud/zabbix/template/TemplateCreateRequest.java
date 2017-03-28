package com.vdncloud.zabbix.template;

import java.util.List;

import com.vdncloud.zabbix.ZabbixApiRequest;
import com.vdncloud.zabbix.host.HostObject;
import com.vdncloud.zabbix.hostgroup.HostgroupObject;
import com.vdncloud.zabbix.util.ZbxListUtils;
/**
 * 
 * @author JuZiDaRen
 *
 */
public class TemplateCreateRequest extends ZabbixApiRequest{
	
	private Params params=new Params();
	
	public TemplateCreateRequest() {
		setMethod("template.create");
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
		private List<TemplateObject> templates;
		private List<HostObject> hosts;
		
		
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
		
		public void addHostId(Integer id){
			HostObject obj=new HostObject();
			obj.setHostid(id);
			hosts=ZbxListUtils.add(hosts, obj);
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
		
		
		
		
		
	}
	
}
