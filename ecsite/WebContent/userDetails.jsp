<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ユーザー情報詳細</title>
</head>
<body>
	<div id="header">
	</div>

	<div id="main">
		<div id="top">
			<p>UserDetails</p>
		</div>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>ログインID</th>
				<th>ログインPASS</th>
				<th>ユーザー名</th>
			</tr>

			<s:iterator value="userDetailsDTO">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="loginId"/></td>
					<td><s:property value="loginPassword"/></td>
					<td><s:property value="userName"/></td>
				</tr>
			</s:iterator>
		</table>

		<s:form action="UserDeleteConfirmAction">
			<s:submit value="削除"/>
		</s:form>

		<p><a href='<s:url action="UserListAction"/>'>戻る</a></p>
	</div>

	<div id="footer">
	</div>


</body>
</html>