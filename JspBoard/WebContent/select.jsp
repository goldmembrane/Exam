<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DB.DBManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
try {
	DBManager db = DBManager.getInstance();
	Connection con = db.open();
	
	// 3. Query 실행 준비
	String sql = "select * from 고객";
	PreparedStatement stmt = con.prepareStatement(sql);
	
	// 4. Query 실행
	ResultSet rs= stmt.executeQuery();
	while(rs.next()) {
		int age = rs.getInt("나이");
		String customerId = rs.getString("고객아이디");
		out.println(age + " " + customerId);
	}
	} catch (ClassNotFoundException e) {

	e.printStackTrace();
} catch (SQLException e) {
	
	e.printStackTrace();
}
%>