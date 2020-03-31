package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.UserCreateConfirmDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserCreateConfirmDAO {

	public UserCreateConfirmDTO checkLoginId(String loginUserId) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		UserCreateConfirmDTO dto = new UserCreateConfirmDTO();

		String sql = "SELECT login_id FROM login_user_transaction where login_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				dto.setLoginUserErrorFlg(true);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dto;

	}

}
