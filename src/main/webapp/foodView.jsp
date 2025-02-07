<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="food-list">
	<h2>피해야 할 음식</h2>
	<ul id="avoid-list">
		<c:forEach items="${requestScope.foodList}" var="food">
			<c:if test="${food.foodType == 'Avoided'}">
				<li>${food.foodName}</li>
			</c:if>
		</c:forEach>
	</ul>
</div>

<div class="food-list">
	<h2 style="color: green;">추천 음식</h2>
	<ul id="recommend-list">
		<c:forEach items="${requestScope.foodList}" var="food">
			<c:if test="${fn:trim(food.foodType) eq 'Recommended'}">
				<li>${food.foodName}</li>
			</c:if>
		</c:forEach>
	</ul>
</div>
