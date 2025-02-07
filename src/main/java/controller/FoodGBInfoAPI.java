package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DiseaseDAO;
import model.DiseaseFoodsDAO;
import model.domain.Disease;
import model.domain.DiseaseFoodDTO;

@WebServlet("/good-bad-info")
public class FoodGBInfoAPI extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // foodId를 요청에서 가져오기
       // int foodId = (int) request.getAttribute("foodId"); // foodId를 적절히 가져오는 코드 추가
        
        // 질병 정보 생성 (DAO에서 질병에 관련된 음식 정보를 가져오기)
    	List<DiseaseFoodDTO> diseaseList = new ArrayList<>(); // 리스트 초기화
		try {
			diseaseList.addAll(DiseaseFoodsDAO.getAllFoodInfoByDiseaseId(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(diseaseList.get(0).getFoodName().toString());
        // request에 질병 리스트 저장
        request.setAttribute("foodList", diseaseList); // 키 이름을 의미 있게 설정

        // mainView.jsp로 포워딩
        request.getRequestDispatcher("/foodView.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

