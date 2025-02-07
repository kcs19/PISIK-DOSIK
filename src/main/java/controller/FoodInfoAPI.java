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
import model.domain.Disease;
@WebServlet("/info-data")
public class FoodInfoAPI extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 질병 정보 생성 (예시)
        List<Disease> diseaseList = new ArrayList<>();
        try {
			diseaseList.addAll(DiseaseDAO.getAllDisease());
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println(diseaseList.get(0).getDiseaseId());

        // request에 질병 리스트 저장
        request.setAttribute("diseases", diseaseList);

        // mainView.jsp로 포워딩
        request.getRequestDispatcher("/mainView.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
