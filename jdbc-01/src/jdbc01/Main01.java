package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main01 {

	public static void main(String[] args) throws Exception {
		//DB연결테스트
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("로딩성공");
		//DBMS연결
		String url="jdbc:oracle:thin:@127.0.0.1/XE";
		String user="spring";
		String password="spring";
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("오라클 연결 성공");
		//SQL통신 객체 생성
		String sql = "INSERT INTO MEMBER(mid,mname,mpwd,mintro)";
		sql += "VALUES('user3','유저3','p3','세번째 유저')";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("INSERT 성공");
		stmt.close();
		conn.close();
	}
}

