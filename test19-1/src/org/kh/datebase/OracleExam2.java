package org.kh.datebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//insert into 테이블명[(필드명1, 필드명2...)] values (값1,값2,....) : 테이블에 레코드 추가
public class OracleExam2 {

	public static void main(String[] args) {
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태변경(on/off)하고, SQL문장 실행할때
		//ResultSet rs = null; //검색(select)문장 실행결과를 반환받음 ResultSet //select문이 아니면 ResultSet는 필요없다.
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "insert into student values(?,?,?)"; //값을 ?로표시, pstmt로 값넣는다
		Student st = new Student(7, "강대신", 75);
		int i = 0;
		
		try {
			Class.forName(driver);	//드라이버 로딩
			try {
				con = DriverManager.getConnection(url, userid, userpw);	//연걸
				pstmt = con.prepareStatement(sql);	//전원 ON
				pstmt.setInt(1, st.getNo());	//쿼리 옵션 추가
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getPoint());
				i = pstmt.executeUpdate();	//SQL 실행 및 결과 반환: insert/update/delet 일때는 commit 명력이 반드시 필요하므로executeUpdate();를 쓴다
				if(i>0) {
					System.out.println(i+"건이 성공적으로 처리 되었습니다.");
				}else {
					System.out.println("SQL구문 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 처리실패 문장 오류");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if(pstmt!= null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
			if(con!= null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		

	}

}
