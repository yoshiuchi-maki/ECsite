package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDetailsDAO;
import com.internousdev.ecsite.dto.ItemDetailsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailsAction extends ActionSupport implements SessionAware {

	private String paramId;
	private List<ItemDetailsDTO> itemDetailsDTO = new ArrayList<ItemDetailsDTO>();
	private Map<String, Object> session;

	public String execute() {

		ItemDetailsDAO dao = new ItemDetailsDAO();
		itemDetailsDTO = dao.select(paramId);
		session.put("paramId", paramId);

		return SUCCESS;

	}

	public String getParamId() {
		return paramId;
	}

	public void setParamId(String paramId) {
		this.paramId = paramId;
	}

	public List<ItemDetailsDTO> getItemDetailsDTO() {
		return itemDetailsDTO;
	}

	public void setItemDetailsDTO(List<ItemDetailsDTO> itemDetailsDTO) {
		this.itemDetailsDTO = itemDetailsDTO;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
