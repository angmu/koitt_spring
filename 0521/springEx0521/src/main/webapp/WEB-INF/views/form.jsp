<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check(){
		if(form.name.value==""){
		alert('얍');
		return false;
		}
		return form.submit();
	}
	
	
</script>
</head>
<body>
	<h2>학생정보</h2>
	<form action="formOk" method="get" name="form">
		<label>학번</label><input type="text" name="stu_num"><br>
		<label>이름</label><input type="text" name="name"><br>
		<label>학과</label><input type="text" name="major"><br>
		<label>연락처</label><input type="text" name="tel"><br>
		<input type="button" onclick="check()" value="입력">
	</form>
</body>
</html>