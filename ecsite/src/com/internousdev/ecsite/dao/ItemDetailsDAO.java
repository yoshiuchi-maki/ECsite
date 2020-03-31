package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ItemDetailsDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemDetailsDAO {

	public List<ItemDetailsDTO> select(String paramId) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		List<ItemDetailsDTO> itemDetailsDTO = new ArrayList<ItemDetailsDTO>();

		String sql = "SELECT id, item_name, item_price, item_stock, insert_date FROM item_info_transaction WHERE id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, paramId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				ItemDetailsDTO dto = new ItemDetailsDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getInt("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				itemDetailsDTO.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return itemDetailsDTO;
	}
}
