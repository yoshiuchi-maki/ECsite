package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.BuyItemConfirmDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemConfirmDAO {

	public BuyItemConfirmDTO countStock(String id) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		BuyItemConfirmDTO dto = new BuyItemConfirmDTO();

		String sql = "SELECT item_stock FROM item_info_transaction WHERE id = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				dto.setStock(rs.getInt("item_stock"));
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
