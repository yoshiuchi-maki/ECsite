package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport {

	List<ItemInfoDTO> itemList = new ArrayList<ItemInfoDTO>();

	public String execute() {

		ItemListDAO dao = new ItemListDAO();
		itemList = dao.itemInfoList();

		return SUCCESS;
	}

	public List<ItemInfoDTO> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemInfoDTO> itemList) {
		this.itemList = itemList;
	}



}
