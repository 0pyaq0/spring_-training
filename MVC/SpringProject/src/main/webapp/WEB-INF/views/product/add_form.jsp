<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="EUC-KR">
<title>��ǰ ��� ������</title>
<script>
	$(document).ready(function(){
		$("#addBtn").click(function(){
			var productName = $("#productName").val();
			var productPrice = $("#productPrice").val();
			var productDesc = $("#productDesc").val();
			var productPhoto = $("#productPhoto").val();
			
			if(productName == "") {
				alert("��ǰ���� �Է����ּ���");
				productName.foucs();
			} else if (productPrice == "") {
				alert("��ǰ ������ �Է����ּ���");
				productPrice.focus();
			} else if (productDesc == "") {
				alert("��ǰ ������ �Է����ּ���");
				productDesc.focus();
			} else if (productPhoto == "") {
				alert("��ǰ ������ �Է����ּ���");
				productPhoto.focus();
			}
			document.form1.action = "${path}/shop/product/insert.do";
			document.form1.submit();
		});
	});
	
</script>
</head>
<body>
<h1>��ǰ ����ϱ�</h1>
<form action="" id="form1" name="form1" enctype="multipart/form-data" method="post">
		<table border="1">
			<tr>
				<td>��ǰ��</td>
				<td><input type="text" name="productName" id="productName"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="productPrice" id="productPrice"></td>
			</tr>
			<tr>
				<td>��ǰ����</td>
				<td><textarea rows="5" cols="60" name="productDesc" id="productDesc"></textarea></td>
			</tr>
			<tr>
				<td>��ǰ�̹���</td>
				<td><input type="file" name="productPhoto" id="productPhoto"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="���" id="addBtn">
					<input type="button" value="���" onclick="location.href='${path}/shop/product/list.do';">
				</td>
			</tr>
		</table>
	</form>
</body>

</html>