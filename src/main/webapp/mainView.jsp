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
	        footer {
			  background-color: #2d3748; /* 배경 색상: 회색 (#2d3748) */
			  color: white; /* 텍스트 색상: 흰색 */
			  margin-top: 3rem; /* 상단 마진: 3rem (12px) */
			  padding-top: 1.5rem; /* 상단 패딩 */
			  padding-bottom: 1.5rem; /* 하단 패딩 */
			}
			/* 최대 너비와 중앙 정렬 */
			footer .max-w-7xl {
			  max-width: 80rem; /* 최대 너비 80rem (1280px) */
			  margin-left: auto; /* 좌측 여백 자동 */
			  margin-right: auto; /* 우측 여백 자동 */
			  padding-left: 1rem; /* 좌측 패딩 */
			  padding-right: 1rem; /* 우측 패딩 */
			}
			
			/* 텍스트 스타일링 */
			footer p {
			  font-size: 1rem; /* 기본 폰트 크기 */
			  text-align: center; /* 텍스트 중앙 정렬 */
			}
			
			/* 전체적인 리스트 스타일 */
			ul {
			  list-style-type: none; /* 기본 목록 스타일 제거 */
			  padding: 0; /* 패딩 제거 */
			  margin: 0; /* 마진 제거 */
			}
			
			li {
			  background-color: #f8f8f8; /* 항목 배경색: 밝은 회색 */
			  color: #333; /* 텍스트 색상: 어두운 회색 */
			  padding: 10px 15px; /* 항목 내부 여백 */
			  margin-bottom: 5px; /* 항목 간의 간격 */
			  border-radius: 4px; /* 둥근 모서리 */
			  font-size: 1rem; /* 폰트 크기 */
			  transition: background-color 0.3s ease; /* 배경색 변경 애니메이션 */
			}
			
			li:hover {
			  background-color: #e2e2e2; /* 마우스 오버시 배경색 변경 */
			}
			
			/* '피해야 할 음식' 제목 스타일 */
			h2 {
			  font-size: 1.5rem; /* 제목 폰트 크기 */
			  margin-top: 20px; /* 제목 상단 마진 */
			  margin-bottom: 10px; /* 제목 하단 마진 */
			  color: #e53e3e; /* 피해야 할 음식 제목 색상: 빨간색 */
			}
			
			/* 추천 음식 제목 스타일 */
			h2[style="color: green;"] {
			  color: #38a169; /* 추천 음식 제목 색상: 초록색 */
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
	        
	        <div class="disease-list" id="disease-list">
			    <select id="disease-select" onchange="loadFoodInfo()">
			        <option value="">질병을 선택하세요</option>
			        <c:forEach items="${diseases}" var="disease">
			            <option value="${disease.diseaseId}">${disease.diseaseName}</option>
			        </c:forEach>
			    </select>
			</div>
	
	        <!-- 음식 정보 섹션 -->
	        <div id="food-info" class="food-list">
	            
	        </div>
	    </div> 
	    <footer className="bg-gray-800 text-white mt-12">
	        <div className="max-w-7xl mx-auto py-6 px-4 text-center">
	          <p>© 2025 건강 식단 정보. All rights reserved.</p>
	        </div>
	    </footer>
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