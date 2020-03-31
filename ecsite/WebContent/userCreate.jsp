<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserCreate画面</title>
</head>
<body>

	<div id="header">
	</div>

	<div id="main">
		<div id="top">
			<p>UserCreate</p>
		</div>

		<div>
			<s:if test="errorMessage != ''">
				<strong><font color="red"><s:property value="errorMessage" escape="false"/></font></strong>
			</s:if>

			<table>
				<s:form action="UserCreateConfirmAction">
				<tr>
					<td>
						<label>ログインID：</label>
					</td>
					<td>
						<input type="text" name="loginUserId" value=""/>
					</td>
				</tr>
				<tr>
					<td>
						<label>ログインPASS：</label>
					</td>
					<td>
						<input type="text" name="loginPassword" value=""/>
					</td>
				</tr>
				<tr>
					<td>
						<label>ユーザー名：</label>
					</td>
					<td>
						<input type="text" name="userName" value=""/>
					</td>
				</tr>

				<s:submit value="登録"/>
				</s:form>
			</table>

				<div>
					<span>前画面に戻る場合は</span>
					<a href='<s:url action="HomeAction"/>'>こちら</a>
				</div>
		</div>
	</div>

	<div id="footer">
	</div>

</body>
</html>