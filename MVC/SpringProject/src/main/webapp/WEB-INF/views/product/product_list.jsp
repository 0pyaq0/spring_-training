<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<title>��ǰ ����Ʈ</title>
</head>
<body>
	<h2>��ǰ���</h2>
	<table border="1">
		<tr>
			<th>��ǰID</th>
			<th>��ǰ�̹���</th>
			<th>��ǰ��</th>
			<th>����</th>
		</tr>
		<c:forEach var="value" items="${list}">
		<tr>
			<td>${value.productId}</td>
			<td>
				<a href="detail/${value.productId}">
					<img src="../img/${value.productUrl}" width="100px" height="100px">
				</a>
			</td>
			<td align="center">
				<a href="detail/${value.productId}">${value.productName}</a><br>
			</td>
			<td>
				<fmt:formatNumber value="${value.productPrice}" pattern="###,###,###"/>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>