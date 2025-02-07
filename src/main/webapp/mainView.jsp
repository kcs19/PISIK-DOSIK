<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="model.domain.Disease" %>


<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>건강 음식 백과</title>
		<link rel="stylesheet" href="mainView.css">
	</head>
	
	<body>
		 <div class="container">
		 	<h2 class="sub-title">알고 먹자!</h2>
	        <h1 class="title">건강 음식 백과🥕</h1>
	        <p class="discription">질병별 맞춤 식단 정보를 확인하세요😊</p>
	        
	        <!-- 질병 목록 -->
	        <div class="disease-list" id="disease-list">
	        	<div class="select-container">
        			<span class="select-text">질병 선택🔎</span>
				    <select id="disease-select" onchange="loadFoodInfo(this.value)" class="select">
				    	<option value="">질병 선택</option>
				        <c:forEach items="${diseases}" var="disease">
				            <option value="${disease.diseaseId}">${disease.diseaseName}</option>
				        </c:forEach>
				    </select>
		    	</div>
			</div>
	
	        
	    </div> 
	    
	    <!-- 음식 정보 섹션 -->
        <div id="food-info" class="container" style="display: none;">
            
        </div>
	    
	    <footer>
	        <div className="footer-text">
	          <p>© 2025 건강 식단 정보. All rights reserved.</p>
	        </div>
	    </footer>
	</body>
	<script>
		function loadFoodInfo(diseaseId) {
			const xhttp = new XMLHttpRequest();
			//alert(diseaseId)
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					let data = this.responseText; //서버가 응답한 데이터를 보유하게 되는 속성
			      	//console.log(data,typeof(data));
			    	document.getElementById("food-info").innerHTML = data;
			    	document.getElementById("food-info").style.display = "block";
			    	}
				};
			xhttp.open("GET", "good-bad-info?diseaseId="+diseaseId);
			xhttp.send();
		}
	</script>
</html>