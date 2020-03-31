package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport {

	private String message;

	public String execute() {

		UserListDeleteCompleteDAO dao = new UserListDeleteCompleteDAO();
		int result = dao.delete();

		if(result > 0) {
			message = "ユーザー情報を削除しました。";
		} else {
			message = "ユーザー情報の削除に失敗しました。";
		}

		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



}
