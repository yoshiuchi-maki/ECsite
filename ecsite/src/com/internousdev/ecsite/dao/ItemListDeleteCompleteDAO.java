package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.internousdev.ecsite.util.DBConnector;

public class ItemListDeleteCompleteDAO {

	public int delete() {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM item_info_transaction";

		int result = 0;

		try {
			Statement stmt = con.createStatement();
			result = stmt.executeUpdate(sql);

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
