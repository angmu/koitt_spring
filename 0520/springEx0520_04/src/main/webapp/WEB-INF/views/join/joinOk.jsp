<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학생성적정보</h2>
	<p>학번: ${student.stu_num }</p>
	<p>학생이름: ${student.stu_name }</p>
	<p>국어: ${student.kor }</p>
	<p>영어: ${student.eng }</p>
	<p>수학: ${student.math }</p>
	<p>합계: ${student.total }</p>
	<p>평균: ${student.avg }</p>
<%-- 	<p>학번: ${stu_num }</p> --%>
<%-- 	<p>학생이름: ${stu_name }</p> --%>
<%-- 	<p>국어: ${kor }</p> --%>
<%-- 	<p>영어: ${eng }</p> --%>
<%-- 	<p>수학: ${math }</p> --%>
<%-- 	<p>합계: ${total }</p> --%>
<%-- 	<p>평균: ${avg }</p> --%>
</body>
</html>