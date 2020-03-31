package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware {

	private String itemName;
	private String price;
	private String stock;
	private Map<String, Object> session;
	private String errorMessage;

	public String execute() {

		String ret = SUCCESS;

		if(!(itemName.equals(""))
				&& !(price.equals(""))
				&& !(stock.equals(""))) {
			session.put("itemName",itemName);
			session.put("price", price);
			session.put("stock", stock);
		} else {
			setErrorMessage("未入力の項目があります。");
			ret = ERROR;
		}

		return ret;

	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
