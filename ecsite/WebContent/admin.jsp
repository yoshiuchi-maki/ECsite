<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>管理者用TOP画面</title>
</head>
<body>
	<div id="header">
	</div>

	<div id="main">
		<div id="top">
			<p>管理者画面</p>
		</div>

		<h3>商品</h3>
			<s:form action="ItemCreateAction">
				<s:submit value="新規登録"/>
			</s:form>

			<s:form action="ItemListAction">
				<s:submit value="一覧"/>
			</s:form>

		<h3>ユーザー</h3>
			<s:form action="UserCreateAction">
				<s:submit value="新規登録"/>
			</s:form>

			<s:form action="UserListAction">
				<s:submit value="一覧"/>
			</s:form>

		<p><a href='<s:url action="GoHomeAction"/>'>Homeに戻る</a></p>
	</div>

	<div id="footer">
	</div>

</body>
</html>