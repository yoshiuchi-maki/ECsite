package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport {

	private String message;

	public String execute() {

		ItemListDeleteCompleteDAO dao = new ItemListDeleteCompleteDAO();
		int result = dao.delete();

		if(result > 0) {
			setMessage("商品情報をすべて削除しました。");
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

}
