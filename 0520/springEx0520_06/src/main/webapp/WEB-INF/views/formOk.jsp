<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	아이디:${id }<br> --%>
<%-- 	패스워드:${pw } --%>
	<table border="1">
		<tr>
			<td>s_num</td>
			<td>${stu.s_num }</td>
		</tr>
		<tr>
			<td>name</td>
			<td>${stu.name }</td>
		</tr>
		<tr>
			<td>major</td>
			<td>${stu.major }</td>
		</tr>
		<tr>
			<td>tel</td>
			<td>${stu.tel }</td>
		</tr>
		<tr>
			<td>address</td>
			<td>${stu.address }</td>
		</tr>
	</table>

</body>
</html>