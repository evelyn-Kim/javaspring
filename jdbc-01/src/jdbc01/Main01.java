package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main01 {

	public static void main(String[] args) throws Exception {
		//DB�����׽�Ʈ
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("�ε�����");
		//DBMS����
		String url="jdbc:oracle:thin:@127.0.0.1/XE";
		String user="spring";
		String password="spring";
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("����Ŭ ���� ����");
		//SQL��� ��ü ����
		String sql = "INSERT INTO MEMBER(mid,mname,mpwd,mintro)";
		sql += "VALUES('user3','����3','p3','����° ����')";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("INSERT ����");
		stmt.close();
		conn.close();
	}
}

