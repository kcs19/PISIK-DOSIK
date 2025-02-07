<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>피해야 할 음식</h2>
<ul id="avoid-list">
	<c:forEach items="${requestScope.foodList}" var="food">
		<c:if test="${not empty food}">
			<li>${food.foodName}</li>
		</c:if>
	</c:forEach>
</ul>


<h2 style="color: green;">추천 음식</h2>
<ul id="recommend-list">
	<c:forEach items="${requestScope.foodList}" var="food">
		<c:if test="${not empty food}">
			<li>${food.foodName}</li>
		</c:if>
	</c:forEach>
</ul>
