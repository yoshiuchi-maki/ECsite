<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品詳細</title>
</head>
<body>
	<div id="header">
	</div>

	<div id="main">
		<div id="top">
			<p>ItemDetails</p>
		</div>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>商品名</th>
				<th>価格</th>
				<th>在庫</th>
				<th>登録日</th>
			</tr>

			<s:iterator value="itemDetailsDTO">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="itemName" /></td>
					<td><s:property value="itemPrice" />円</td>
					<td><s:property value="itemStock" />個</td>
					<td><s:property value="insertDate" /></td>
				</tr>
			</s:iterator>
		</table>

		<s:form action="ItemDeleteConfirmAction">
			<s:submit value="削除"/>
		</s:form>

		<p><a href='<s:url action="ItemListAction"/>'>戻る</a></p>
	</div>

	<div id="footer">
	</div>


</body>
</html>