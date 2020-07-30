<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학생성적입력</h2>
	<form action="joinOk" method="get">
		<label for="stu_num">학생번호</label><input type="text" name="stu_num" id="stu_num"><br>
		<label for="stu_name">학생이름</label><input type="text" name="stu_name" id="stu_name"><br>
		<label for="kor">국어</label><input type="text" name="kor" id="kor"><br>
		<label for="eng">영어</label><input type="text" name="eng" id="eng"><br>
		<label for="math">수학</label><input type="text" name="math" id="math"><br>
		<label for="total">합계</label><input type="text" name="total" id="total"><br>
		<label for="avg">평균</label><input type="text" name="avg" id="avg"><br>
		<input type="submit" value="전송"><input type="reset" value="취소">
	</form>
</body>
</html>