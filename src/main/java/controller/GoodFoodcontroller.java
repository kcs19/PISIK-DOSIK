package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.domain.Food;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/goodFood")
public class GoodFoodcontroller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String diseaseId = request.getParameter("diseaseId");
		
		List<Food> foodList = new ArrayList<>();
		foodList.add(new Food(1, "사과"));
        foodList.add(new Food(2, "바나나"));
        foodList.add(new Food(3, "닭가슴살"));
        foodList.add(new Food(4, "브로콜리"));
        foodList.add(new Food(5, "고구마"));
        foodList.add(new Food(6, "연어"));
        foodList.add(new Food(7, "견과류"));
        foodList.add(new Food(8, "두부"));
        foodList.add(new Food(9, "요거트"));
        foodList.add(new Food(10, "김치"));
		
		request.setAttribute("foodList", foodList);
		System.out.println(diseaseId);
		
		request.getRequestDispatcher("goodFoodView.jsp")
		.forward(request, response);
	}


}
