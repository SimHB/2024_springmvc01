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
		<ul><h2>차 이름</h2>
		<c:forEach var="k" items="${carName }">
			<li>${k }</li>
		</c:forEach>
		</ul>
	</body>
</html>