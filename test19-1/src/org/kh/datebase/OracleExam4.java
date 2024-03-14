package org.kh.datebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//delete from 테이블명 [where 필드면=값] : 테이블의 특정조건에 맞는 레코드 삭제
//where 생략하면 다지워짐
public class OracleExam4 {

	public static void main(String[] args) {
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태변경(on/off)하고, SQL문장 실행할때
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "delete from student where no=?"; //********
		//String sql = "delete from student where name=?";
		Student st = new Student(5, "김미연", 10);
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getNo()); //**********
				//pstmt.setString(1, st.getName());
				i=pstmt.executeUpdate();	//***********
				if(i>0) {
					System.out.println(i+"건이 정상적으로 처리 되었습니다.");
				}else {
					System.out.println("처리실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 처리 실패");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
