<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	<form method="post" action="login">
		아이디  &nbsp;&nbsp;&nbsp;<input type="text" name="id"/> &nbsp;&nbsp;
		비밀번호 <input type="password" name="pw"/><br>
		이름  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name"/><br><br>
		취미 : <input type="checkbox" name="hobby" value="climbing">Climbing
		      <input type="checkbox" name="hobby" value="swim">Swim
		      <input type="checkbox" name="hobby" value="reading">Reading
		      <input type="checkbox" name="hobby" value="music">Music
		      <br>
		성별 : <input type="radio" name="gender" value="male">male
		      <input type="radio" name="gender" value="female">female
		      <br>
		직업 : <select name="job">
    			<option value="학생">학생</option>
    			<option value="공무원">공무원</option>
    			<option value="무직">무직</option>
			  </select><br><br>
		자기소개 <br> <textarea rows="5" name="aboutMe"></textarea><br><br>
		<button type="submit">Login</button>
	</form>
</body>
</html>