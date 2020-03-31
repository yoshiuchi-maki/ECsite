<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品情報一覧</title>
</head>
<body>
	<div id="header">
	</div>

	<div id="main">
		<div id="top">
			<p>ItemList</p>
		</div>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>商品名</th>
				<th>商品詳細</th>
			</tr>

			<s:iterator value="itemList">

				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="itemName" /></td>
					<td>
						<a href=
							'<s:url action="ItemDetailsAction">
								<s:param name="paramId" value="id"/>
							</s:url>'>
						詳細</a>
					</td>
				</tr>
			</s:iterator>
		</table>


		<s:form action="ItemListDeleteConfirmAction">
			<s:submit value="削除" />
		</s:form>
		<br>

		<a href='<s:url action="AdminAction"/>'>戻る</a>
	</div>

	<div id="footer">
	</div>

</body>
</html>