package org.kh.datebase2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.datebase.Student;

public class MariaDBExam3 {

	public static void main(String[] args) {
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태변경(on/off)하고, SQL문장 실행할때
		//ResultSet rs = null; //검색(select)문장 실행결과를 반환받음 ResultSet //select문이 아니면 ResultSet는 필요없다.
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		String sql = "update student set name=?, point=? where no=?";
		Student updSt = new Student(3, "park", 88);
		int i =0;
		//MariaDB의 temp 데이터베이스의 student 테이블 3번 학생의 데이터를 updSt의 내용으로 레포드가 변경될 수 있도록 자바 프로그래밍을 완성하시오.
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updSt.getName());
				pstmt.setInt(2, updSt.getPoint());
				pstmt.setInt(3, updSt.getNo());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println("레코드 정상추가");
				}else {
					System.out.println("레코드 추가실패");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
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
