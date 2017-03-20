package com.vdncloud.zabbix.host;

import java.util.List;

import com.vdncloud.zabbix.ZabbixApiRequest;
import com.vdncloud.zabbix.hostgroup.HostgroupObject;
import com.vdncloud.zabbix.hostinterface.HostInterfaceObject;
import com.vdncloud.zabbix.user.macro.Macro;
import com.vdncloud.zabbix.util.ZbxListUtils;

/**
 * 
 * @author JuZiDaRen
 * @date 2017-03-17
 */
public class HostCreateRequest extends ZabbixApiRequest{
    
	private Params params=new Params();
	
	public HostCreateRequest() {
		setMethod("host.create");
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



	public class Params extends HostObject{
    	 private List<HostgroupObject> groups;
    	 private List<HostInterfaceObject> interfaces;
    	 private List<Integer> templates;
    	 private List<Macro> macros;
    	 
    	 public Params(){}
    	 
    	 public void addGroupId(Integer id){
    		 HostgroupObject obj=new HostgroupObject();
    		 obj.setGroupid(id);
    		 groups=ZbxListUtils.add(groups, obj);
    	 }
    	 
    	 public void addHostInterfaceObject(HostInterfaceObject obj){
    		 interfaces=ZbxListUtils.add(interfaces, obj);
    	 }
    	 
    	 public void addTemplateId(Integer id){
    		 templates=ZbxListUtils.add(templates, id);
    	 }
    	 
    	 public void addMacro(Macro macro){
    		 macros=ZbxListUtils.add(macros, macro);
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
		 * @return the interfaces
		 */
		public List<HostInterfaceObject> getInterfaces() {
			return interfaces;
		}

		/**
		 * @param interfaces the interfaces to set
		 */
		public void setInterfaces(List<HostInterfaceObject> interfaces) {
			this.interfaces = interfaces;
		}

		/**
		 * @return the templates
		 */
		public List<Integer> getTemplates() {
			return templates;
		}

		/**
		 * @param templates the templates to set
		 */
		public void setTemplates(List<Integer> templates) {
			this.templates = templates;
		}

		/**
		 * @return the macros
		 */
		public List<Macro> getMacros() {
			return macros;
		}

		/**
		 * @param macros the macros to set
		 */
		public void setMacros(List<Macro> macros) {
			this.macros = macros;
		}
    	 
    	 
    	 
    	 
     }
	
	
}
