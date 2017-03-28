package com.vdncloud.zabbix.template;

import java.util.List;

import com.vdncloud.zabbix.ZabbixApiResponse;

public class TemplateGetResponse extends ZabbixApiResponse{

	public TemplateGetResponse() {
		super();
	}

	private List<Result> result;
	
	public class Result extends TemplateObject{
		
	}

	/**
	 * @return the result
	 */
	public List<Result> getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(List<Result> result) {
		this.result = result;
	}
	
	
	
	
	
}
