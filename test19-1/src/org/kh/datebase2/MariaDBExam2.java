package org.kh.datebase2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.datebase.Student;

public class MariaDBExam2 {

	public static void main(String[] args) {
		
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태변경(on/off)하고, SQL문장 실행할때
		//ResultSet rs = null; //검색(select)문장 실행결과를 반환받음 ResultSet //select문이 아니면 ResultSet는 필요없다.
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		String sql = "insert into student values(?,?,?)";
		Student newSt = new Student(6, "kim", 95);
		//Statement pstmt = null;
		//String sql = "insert into student values("+newSt.getNO()+","+"'"+newSt.getName()+"'"+","+newSt.getPoint()")";
		
		//MariaDB 와 temp 데이터베이스의 student 테이블의 newSt의 내용을 레코드로 추가되도록 자바프로그램을 완성하시오.
		int i= 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, newSt.getNo());
				pstmt.setNString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				i= pstmt.executeUpdate();
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
