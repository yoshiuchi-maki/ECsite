package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	public List<ItemInfoDTO> itemInfoList() {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		List<ItemInfoDTO> itemList = new ArrayList<ItemInfoDTO>();

		String sql = "SELECT id, item_name FROM item_info_transaction";

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()) {
				ItemInfoDTO dto = new ItemInfoDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				itemList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return itemList;
	}

}
