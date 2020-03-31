package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserDeleteCompleteDAO {

	public int delete(String paramLoginId) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;

		String sql ="DELETE FROM login_user_transaction WHERE login_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, paramLoginId);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}
}
