<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品登録確認画面</title>
</head>
<body>
	<div id="header"></div>

	<div id="main">
		<div id="top">
			<p>ItemCreateConfirm</p>
		</div>

		<h3>登録する商品情報は以下でよろしいですか。</h3>

		<table>
			<s:form action="ItemCreateCompleteAction">
				<tr>
					<td><label>商品名：</label></td>
					<td><s:property value="itemName" /></td>
				</tr>

				<tr>
					<td><label>価格：</label></td>
					<td><s:property value="price" />円</td>
				</tr>

				<tr>
					<td><label>個数：</label></td>
					<td><s:property value="stock" />個</td>
				</tr>
					<s:submit value="完了" />
			</s:form>
		</table>
	</div>

	<div id="footer"></div>

</body>
</html>