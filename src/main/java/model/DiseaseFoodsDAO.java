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
			
			pstmt = con.prepareStatement("select df.food_type, f.food_name, df.reason from disease_foods df, foods f where df.disease_id=? and f.food_id = df.food_id;");
			pstmt.setInt(1, diseaseId);
			rs = pstmt.executeQuery();
			foodList = new ArrayList<>();
			
			while (rs.next()) {
				foodList.add(new DiseaseFoodDTO(rs.getString(1), rs.getString(2), rs.getString(3)));
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
