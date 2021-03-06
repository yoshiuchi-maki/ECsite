<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>新規商品登録画面</title>
</head>
<body>

	<div id="header">
	</div>

	<div id="main">
		<div id="top">
			<p>ItemCreate</p>
		</div>

		<s:if test="errorMessage != null">
			<strong><font color="red"><s:property value="errorMessage"/></font></strong>
		</s:if>

		<table>
			<s:form action="ItemCreateConfirmAction">
				<tr>
					<td><label>商品名：</label></td>
					<td><input type="text" name="itemName" /></td>
				</tr>

				<tr>
					<td><label>価格：</label></td>
					<td><input type="text" name="price" /></td>
				</tr>

				<tr>
					<td><label>個数：</label></td>
					<td><input type="text" name="stock" /></td>
				</tr>

				<br>
				<s:submit value="登録" />
			</s:form>
		</table>

		<div>
			<span>前画面に戻る場合は</span>
			<a href='<s:url action="AdminAction"/>'>こちら</a>
		</div>
	</div>

	<div id="footer">
	</div>

</body>
</html>