<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="formOk2" method="get">
		번호<input type="text" name="bnum"><br>
		제목<input type="text" name="btitle"><br>
		내용<textarea name="bcontent"></textarea><br>
		날짜<input type="date" name="date"><br>
		그룹<input type="text" name="group"><br>
		step<input type="text" name="step"><br>
		indent<input type="text" name="indent"><br>
		<input type="submit" value="전송"><input type="reset" value="취소">
	</form>
</body>
</html>