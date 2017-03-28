package com.vdncloud.zabbix.template;

import java.util.List;

import com.vdncloud.zabbix.ZabbixApiResponse;

public class TemplateCreateResponse extends ZabbixApiResponse{

	private Result result;
	
	public TemplateCreateResponse() {
		super();
	}


	/**
	 * @return the result
	 */
	public Result getResult() {
		return result;
	}


	/**
	 * @param result the result to set
	 */
	public void setResult(Result result) {
		this.result = result;
	}


	public class Result{
		private List<Integer> templateids;
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
		
	}
	
	
}
