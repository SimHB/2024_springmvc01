<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>결과 : result2.jsp</h1>
		<ul><h2>강아지이름들</h2>
			<c:forEach var="k" items="${dogName }">
				<li><h3>${k }</h3></li>
			</c:forEach>
		</ul>
		<hr>
		<ul><h2>고양이이름들</h2>
			<c:forEach var="k" items="${catName }">
				<li><h3>${k }</h3></li>
			</c:forEach>
		</ul>
	</body>
</html>