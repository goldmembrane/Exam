<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DB.DBManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
try {
	DBManager db = DBManager.getInstance();
	Connection con = db.open();
	
	// 3. Query ���� �غ�
	String sql = "select * from ��";
	PreparedStatement stmt = con.prepareStatement(sql);
	
	// 4. Query ����
	ResultSet rs= stmt.executeQuery();
	while(rs.next()) {
		int age = rs.getInt("����");
		String customerId = rs.getString("�����̵�");
		out.println(age + " " + customerId);
	}
	} catch (ClassNotFoundException e) {

	e.printStackTrace();
} catch (SQLException e) {
	
	e.printStackTrace();
}
%>