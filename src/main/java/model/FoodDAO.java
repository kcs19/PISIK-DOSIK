package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DataSourceManager;

public class FoodDAO {
	// food Id로 음식명 반환하는 메소드
	public static String getFoodNameByFoodId(int foodId) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String foodName = null;
		
		try {
			con = DataSourceManager.getConnection();
			pstmt = con.prepareStatement("select food_name from foods where food_id=?");
			pstmt.setInt(1, foodId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				foodName = rs.getString(1);
			}
		} finally {
			DataSourceManager.close(con, pstmt, rs);
		}
		return foodName;
	}
}
