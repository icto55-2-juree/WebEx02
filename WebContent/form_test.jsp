<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/WebEx02/param" method="post">
이름: <input type="text" name="name" ><br><br>
<label for="hobby">취미</label>
<input type="checkbox" name="hobby" value="컴퓨터"> 컴퓨터
<input type="checkbox" name="hobby" value="영화감상"> 영화감상
<input type="checkbox" name="hobby" value="음주"> 음주
<input type="checkbox" name="hobby" value="가무">가무 <br><br>
메일 정보 수신 여부:
<input type="radio" id="check_mail" name="check_mail" value="yes" checked> 수신
<input type="radio" id="check_mail" name="check_mail" value="no" > 거절 <br><br>
<label for="kind">직종</label>
<select id="kind" name="kind" size="1">
<option value="">선택하세요</option>
<option value="IT">IT</option>
<option value="Marketing">Marketing</option>
<option value="Finance">Finance</option>
<option value="Sales">Sales</option>
</select><br><br>
<label for="content">가입 소감</label><br>
<textarea id="content" name="content" rows="3" cols="35"></textarea><br><br>
<input type="submit" value="가입">
</form>
</body>
</html>