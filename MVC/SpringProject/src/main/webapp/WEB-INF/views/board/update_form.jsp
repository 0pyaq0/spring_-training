<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Board Update</h1>
<form method="post" action="board_update">
		���� : <input type="text" name="title" /> <br><br>
		��й�ȣ : <input type="text" name="password" /> <br><br>
		�۾��� : <input type="text" name="writer" /> <br><br>
		�̸��� : <input type="text" name="email" /> <br><br>
		���� : <textarea name="content" rows="20"></textarea> <br><br>
		<button type="submit">�����Ϸ�</button>
	</form>
</body>
</html>