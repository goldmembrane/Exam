<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DB.DBManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	String id = request.getParameter("title");
	String pw = request.getParameter("content");

	
	try {
		DBManager db = DBManager.getInstance();
		Connection con = db.open();
		
		// 3. Query ���� �غ�
		String sql = "insert into article values (null, ?, ?, 0, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, id);
		stmt.setString(2, pw);
		stmt.setString(3, "a");
		int result = stmt.executeUpdate(); // �����̸� 1�̻�, ���и� 0
		if(result>0) {
			out.println("�ۼ��Ϸ�");
		}else {
			out.println("�ۼ�����");
		}
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
%>