package com.internousdev.ecsite.dto;

public class UserCreateConfirmDTO {

	private String loginUserId;
	private boolean loginUserErrorFlg = false;

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public boolean getLoginUserErrorFlg() {
		return loginUserErrorFlg;
	}

	public void setLoginUserErrorFlg(boolean loginUserErrorFlg) {
		this.loginUserErrorFlg = loginUserErrorFlg;
	}


}
