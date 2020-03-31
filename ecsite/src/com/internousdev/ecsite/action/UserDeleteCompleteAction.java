package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteCompleteAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;
	private String message;

	public String execute() {

		UserDeleteCompleteDAO dao = new UserDeleteCompleteDAO();
		String paramLoginId = session.get("paramLoginId").toString();
		int result = dao.delete(paramLoginId);

		if(result == 1) {
			setMessage("ユーザー情報を削除しました。");
		} else {
			setMessage("ユーザー情報の削除に失敗しました。");
		}

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
