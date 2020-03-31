package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserDetailsDAO;
import com.internousdev.ecsite.dto.UserDetailsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDetailsAction extends ActionSupport implements SessionAware {

	private String paramLoginId;
	private Map<String, Object> session;
	private List<UserDetailsDTO> userDetailsDTO = new ArrayList<UserDetailsDTO>();

	public String execute() {

		UserDetailsDAO dao = new UserDetailsDAO();
		userDetailsDTO = dao.select(paramLoginId);
		session.put("paramLoginId", paramLoginId);

		return SUCCESS;

	}

	public String getParamLoginId() {
		return paramLoginId;
	}

	public void setParamLoginId(String paramLoginId) {
		this.paramLoginId = paramLoginId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<UserDetailsDTO> getUserDetailsDTO() {
		return userDetailsDTO;
	}

	public void setUserDetailsDTO(List<UserDetailsDTO> userDetailsDTO) {
		this.userDetailsDTO = userDetailsDTO;
	}

}
