package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.domain.Disease;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/index")
public class DiseaseController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 // 질병 데이터 생성
	        List<Disease> diseases = new ArrayList<>();
	
	        // 고혈압
	        diseases.add(new Disease(1, "고혈압"));
	
	        // 당뇨병
	        diseases.add(new Disease(2, "당뇨병"));
	
	        // 데이터 JSP로 전달
	        request.setAttribute("diseases", diseases);
	
	        // JSP로 포워딩
	        request.getRequestDispatcher("/mainView.jsp").forward(request, response);
	}

}
