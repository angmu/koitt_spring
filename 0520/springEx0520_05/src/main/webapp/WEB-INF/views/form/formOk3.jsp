<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>정보</h2>
	<p>번호:${bdto.bnum }</p>
	<p>제목:${bdto.btitle }</p>
	<p>내용:${bdto.bcontent }</p>
	<p>날짜:${bdto.date }</p>
	<p>그룹:${bdto.group }</p>
	<p>step:${bdto.step }</p>
	<p>indent:${bdto.indent }</p>
	<p><a href="main">돌아가기</a></p>
</body>
</html>