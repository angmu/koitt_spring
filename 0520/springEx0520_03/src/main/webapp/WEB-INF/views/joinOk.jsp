<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<caption>회원정보</caption>
		<tr>
			<td>회원번호</td>
			<td>${mem_num }</td>
		</tr>
		<tr>
			<td>회원이름</td>
			<td>${mem_name }</td>
		</tr>
		<tr>
			<td>주소</td>
			<td>${address }</td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td>${tel }</td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td>${birth }</td>
		</tr>
	</table>
</body>
</html>