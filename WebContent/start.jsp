<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="GoPostAction">
郵便番号
<s:textfield name="post">
		</s:textfield>
		<s:submit value="郵便番号の登録" />
	</s:form>
	<s:form action="GoPostAction">
電話番号
<s:textfield name="tel">
		</s:textfield>
		<s:submit value="電話番号の登録" />
	</s:form>
	<s:form action="GoEmailAction">
メール
<s:textfield name="email">
		</s:textfield>
		<s:submit value="Eメールの登録" />
	</s:form>
</body>
</html>