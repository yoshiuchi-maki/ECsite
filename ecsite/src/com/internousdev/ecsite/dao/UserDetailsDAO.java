package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserDetailsDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserDetailsDAO {

	public List<UserDetailsDTO> select(String paramLoginId){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		List<UserDetailsDTO> userDetailsDTO = new ArrayList<UserDetailsDTO>();

		String sql = "SELECT id, login_id, login_pass, user_name FROM login_user_transaction where login_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, paramLoginId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				UserDetailsDTO dto = new UserDetailsDTO();
				dto.setId(rs.getInt("id"));
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				userDetailsDTO.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return  userDetailsDTO;

	}

}
