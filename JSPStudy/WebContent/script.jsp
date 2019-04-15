<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%!
	// java의 메소드
	public String method() {
	return "메소드실행";
}
%>

<%
	// 스크립틀릿 scriptlet
	method();
	String name = " ";
	name = "JSP";
	out.println(name);
%>
<br>
	<%=name%>