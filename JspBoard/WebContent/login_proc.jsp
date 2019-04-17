<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DB.DBManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	
	try {
		DBManager db = DBManager.getInstance();
		Connection con = db.open();
		
		// 3. Query 실행 준비
		String sql = "select id from person_info where id=? and pw=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, id);
		stmt.setString(2, pw);
		ResultSet rs = stmt.executeQuery();
		boolean isOk = false;
		if(rs.next()) {
			isOk = true;
		}
		if(isOk == true) {
			out.println("로그인되었습니다.");
		}else {
			out.println("다시 입력해주세요");
		}
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
%>