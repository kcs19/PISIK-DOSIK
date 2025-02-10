package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.domain.Disease;
import util.DataSourceManager;

public class DiseaseDAO {
	//모든 질병 정보 반환 메소드
	public static ArrayList<Disease> getAllDisease() throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Disease> all = null;
		
		try {
			con = DataSourceManager.getConnection();
			pstmt = con.prepareStatement("select * from diseases order by diseases_name");
			rs = pstmt.executeQuery();
			
			all = new ArrayList<>();
			while(rs.next()) {
				all.add(new Disease(rs.getInt("disease_id"), rs.getString("disease_name")));
			}
		}finally {
			DataSourceManager.close(con,pstmt,rs);
		}
		return all;
	}

	
	
}
