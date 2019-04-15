<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String color = request.getParameter("color");
	out.println(color);
	if(color.equals("blue")) {
		// 파란색 배경 변경
%>
	<style>
		body {
			background: blue;
		}
	
	</style>
<%		
	}else if(color.equals("red")) {
		// 빨간색 배경 변경
%>

<style>
		body {
			background: red;
		}
	
	</style>
<%
	}
%>