<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%!
	// java�� �޼ҵ�
	public String method() {
	return "�޼ҵ����";
}
%>

<%
	// ��ũ��Ʋ�� scriptlet
	method();
	String name = " ";
	name = "JSP";
	out.println(name);
%>
<br>
	<%=name%>