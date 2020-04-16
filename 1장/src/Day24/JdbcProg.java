package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProg {
	public static void main(String[] args) {
//		String jdbc_url = "jdbc:mysql://localhost:3306/my_database";	//6.0 ����
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?userUnicode=true"		//�����ּ�:��Ʈ��ȣ/������ DB?�����ڵ� ���ų�?=��
				+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";		//6.0 ����				//serverTimezone= TFC �����ð� ���ð��� ������= Asia/Seoul 
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");			6.0 ����
			Class.forName("com.mysql.cj.jdbc.Driver");		//6.0 ���� �������� ������: 8����
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			System.out.println("<< �л���� >>");
			System.out.println("[�й�]\t[�̸�]");

			String sql = "SELECT * FROM student WHERE sex=? && address=?";
			conn = DriverManager.getConnection(jdbc_url, "root", "yt1234");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "M");
			pstmt.setString(2, "Seoul");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int stuNo = rs.getInt("stuNo");
				String name = rs.getString("name");
				System.out.println(stuNo + "\t" + name);
				
			}
		}	catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		}	catch(SQLException se) {
			System.out.println(se.getMessage());
		}	finally {
				try {
					if (rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	private static Statement executeQuery() {
		// TODO Auto-generated method stub
		return null;
	}

}


