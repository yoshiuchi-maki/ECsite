<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ユーザー情報一覧</title>
</head>
<body>
	<div id="header">
	</div>

	<div id="main">
		<div id="top">
			<p>UserList</p>
		</div>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>ログインID</th>
				<th>詳細情報</th>
			</tr>

			<s:iterator value="userList">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="loginId"/></td>
					<td>
						<a href=
							'<s:url action="UserDetailsAction">
								<s:param name="paramLoginId" value="loginId"/>
							</s:url>'>
						詳細</a>
					</td>
				</tr>
			</s:iterator>
		</table>



		<s:form action="UserListDeleteConfirmAction">
			<s:submit value="削除"/>
		</s:form>

		<p><a href='<s:url action="AdminAction"/>'>戻る</a></p>
	</div>

	<div id="footer">
	</div>

</body>
</html>