<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="avoid-food-list">
    <h2 class="avoid-title">피해야 할 음식⚠️</h2>
    <ul id="avoid-list">
        <c:forEach items="${requestScope.foodList}" var="food">
            <c:if test="${food.foodType == 'Avoided'}">
                <li class="avoid-item">
                    <div class="food-header">
                        <span class="food-name">❌ ${food.foodName}</span>
                    </div>
                    <div class="food-reason">${food.reason}</div>
                </li>
            </c:if>
        </c:forEach>
    </ul>
</div>


<div class="recommand-food-list">
    <h2 class="recommend-title" style="color: green;">추천 음식✨</h2>
    <ul id="recommend-list">
        <c:forEach items="${requestScope.foodList}" var="food">
            <c:if test="${food.foodType == 'Recommended'}">
                <li class="recommend-item">
                    <div class="food-header">
                        <span class="food-name">✅ ${food.foodName}</span>
                    </div>
                    <div class="food-reason">${food.reason}</div>
                </li>
            </c:if>
        </c:forEach>
    </ul>
</div>