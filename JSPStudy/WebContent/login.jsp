<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
<%
	String loginId = (String)session.getAttribute("login_id");
	if(loginId == null) {
%>   
    
<form method= "post" action="Login_proc.jsp">
	ID : <input type = "text" name="user_id">
	<br>
	PW : <input type = "password" name="user_pw">
	<br>
	<input type="submit" name="login ��ư">
</form>

<% 
	}else {
		out.println("�̹� �α��εǾ� �ֽ��ϴ�.");
	}
%>

		<a href="Logout.jsp">�α׾ƿ�</a>
<%


%>