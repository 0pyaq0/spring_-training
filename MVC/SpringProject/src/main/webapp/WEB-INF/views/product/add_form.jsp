<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>product add form</title>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(function(){
   $("#addBtn").click(function(){
	    var productName = $("#productName").val();
		var productPrice = $("#productPrice").val();
		var productDesc = $("#productDesc").val();
		var productPhoto = $("#productPhoto").val();

      if(productName==""){
         alert("��ǰ���� �Է����ּ���");
         productName.focus();
      }
      else if(productPrice==""){
         alert("��ǰ ������ �Է����ּ���");
         productPrice.focus();
      }
      else if(productDesc==""){
         alert("��ǰ ������ �Է����ּ���");
         productDesc.focus();
      }
      document.myForm.action="insert_product";
      document.myForm.submit();
   });

   $("#listBtn").click(function(){
      location.href="list";
   });
})
</script>
</head>
<body>
   <h1>��ǰ ���</h1>
   <form id="myForm" name="myForm"
      enctype="multipart/form-data" method="post">
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
					<input type="button" value="�޴�" id="listBtn">
				</td>
			</tr>
		</table>
   </form>
</body>
</html>