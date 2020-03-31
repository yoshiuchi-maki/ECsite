package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport implements SessionAware {

	private String message;
	private Map<String, Object> session;

	public String execute() {

		ItemDeleteCompleteDAO dao = new ItemDeleteCompleteDAO();
		String paramId = session.get("paramId").toString();
		int result = dao.delete(paramId);

		if(result == 1) {
			setMessage("商品情報を削除しました。");
		} else if (result == 0) {
			setMessage("商品情報の削除に失敗しました。");
		}

		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
