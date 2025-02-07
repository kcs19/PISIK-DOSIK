package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DiseaseFoodsDAO;
import model.domain.DiseaseFoodDTO;
@WebServlet("/good-bad-info")
public class FoodGBInfoAPI extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // GET 파라미터에서 diseaseId 가져오기
        String diseaseIdStr = request.getParameter("diseaseId"); // request.getParameter()로 변경
        if (diseaseIdStr == null || diseaseIdStr.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // 잘못된 요청 처리
            return;
        }

        // diseaseId를 int로 변환
        int diseaseId = Integer.parseInt(diseaseIdStr);

        // 질병에 해당하는 음식 정보를 가져오기 (DAO 호출)
        List<DiseaseFoodDTO> diseaseList = new ArrayList<>();
        try {
            diseaseList.addAll(DiseaseFoodsDAO.getAllFoodInfoByDiseaseId(diseaseId));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // request에 질병 리스트 저장
        request.setAttribute("foodList", diseaseList);

        // JSP로 포워딩
        request.getRequestDispatcher("/foodView.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
