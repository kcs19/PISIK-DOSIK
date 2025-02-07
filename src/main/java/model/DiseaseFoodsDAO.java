package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.domain.DiseaseFoodDTO;
import util.DataSourceManager;


public class DiseaseFoodsDAO {
	// 질병 id에 따라 피해야 하는 음식, 추천하는 음식 리스트를 반환하는 메소드
	public static ArrayList<DiseaseFoodDTO> getAllFoodInfoByDiseaseId(int diseaseId) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		ArrayList<DiseaseFoodDTO> foodList = null;

		try {
			con = DataSourceManager.getConnection();
			pstmt = con.prepareStatement("select * from disease_foods where disease_id=?");
			pstmt.setInt(1, diseaseId);
			rs = pstmt.executeQuery();
			
			int foodId = rs.getInt("food_id");
			pstmt2 = con.prepareStatement("select food_name from foods where food_id=?");
			pstmt2.setInt(1, foodId);
			rs2 = pstmt.executeQuery();
			
			foodList = new ArrayList<>();
			while (rs.next()) {
				foodList.add(new DiseaseFoodDTO(rs.getString("food_type"), rs2.getString("food_name"), rs.getString("reason")));
			}
			
		} finally {
			DataSourceManager.close(con, pstmt, rs);
		}
		return foodList;
	}
}
