package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProg {
	public static void main(String[] args) {
//		String jdbc_url = "jdbc:mysql://localhost:3306/my_database";	//6.0 이전
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?userUnicode=true"		//접속주소:포트번호/접속할 DB?유니코드 쓸거냐?=예
				+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";		//6.0 이후				//serverTimezone= TFC 서버시간 어디시간을 쓸건지= Asia/Seoul 
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");			6.0 이전
			Class.forName("com.mysql.cj.jdbc.Driver");		//6.0 이후 지금현재 사용버전: 8버전
			System.out.println("데이터베이스에 접속했습니다.");
			System.out.println("<< 학생명단 >>");
			System.out.println("[학번]\t[이름]");

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


