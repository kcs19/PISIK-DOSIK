<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="model.domain.Disease" %>


<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>건강 식단 정보</title>
	    <style>
	        body {
	            font-family: Arial, sans-serif;
	            background-color: #f9f9f9;
	            margin: 0;
	            padding: 0;
	        }
	        .container {
	            width: 80%;
	            margin: 20px auto;
	            background: white;
	            padding: 20px;
	            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
	        }
	        .search-box {
	            width: 95%;
	            padding: 10px;
	            font-size: 16px;
	            margin-bottom: 20px;
	            border: 1px solid #ddd;
	        }
	        .disease-list button {
	            display: block;
	            width: 100%;
	            padding: 10px;
	            margin: 5px 0;
	            background-color: #f0f0f0;
	            border: none;
	            cursor: pointer;
	            text-align: left;
	        }
	        .disease-list button:hover {
	            background-color: #ddd;
	        }
	        .food-list {
	            margin-top: 20px;
	        }
	        .food-list h2 {
	            color: #d9534f;
	        }
	    </style>
	</head>
	
	<body>
		 <div class="container">
	        <h1>건강 식단 정보</h1>
	        <p>질병별 맞춤 식단 정보를 확인하세요</p>
	
	        <!-- 검색창 -->
	        <input type="text" id="search" class="search-box" placeholder="질병명을 검색하세요">
	
	        <!-- 질병 목록 -->
	        <div class="disease-list" id="disease-list">
	        	<c:forEach items="${diseases}" var="disease">
					<button onclick="loadFoodInfo(${disease.diseaseId})">
						${disease.diseaseId}<br>
						${disease.diseaseName}<br>
					</button>
				</c:forEach>
	        </div>	
	
	        <!-- 음식 정보 섹션 -->
	        <div id="food-info" class="food-list">
	            
	        </div>
	    </div> 
	    
	</body>
	<script>
		function loadFoodInfo(diseaseId) {
			alert(1);
			const xhttp = new XMLHttpRequest();
			
		
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					let data = this.responseText; //서버가 응답한 데이터를 보유하게 되는 속성
			      	console.log(data,typeof(data));
			    	document.getElementById("food-info").innerHTML = data;
			    	}
				};
			xhttp.open("GET", "goodFood?diseaseId="+diseaseId);
			xhttp.send();
		}
	</script>
</html>