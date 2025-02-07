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
		ResultSet rs = null;
		ArrayList<DiseaseFoodDTO> foodList = null;
		
		try {
			con = DataSourceManager.getConnection();
			
			pstmt = con.prepareStatement("select * from disease_foods where disease_id=?");
			pstmt.setInt(1, diseaseId);
			rs = pstmt.executeQuery();
			foodList = new ArrayList<>();
			
			while (rs.next()) {
				int foodId = rs.getInt(3);
				foodList.add(new DiseaseFoodDTO(rs.getString(4), FoodDAO.getFoodNameByFoodId(foodId), rs.getString(5)));
			}
			System.out.println(foodList);
			for (DiseaseFoodDTO f : foodList) {
				System.out.println(f.toString());
			}
		} finally {
			DataSourceManager.close(con, pstmt, rs);
		}
		return foodList;
	}
}
