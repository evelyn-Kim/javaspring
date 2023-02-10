package jdbc01;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		DataSource ds = context.getBean(DataSource.class);
		Connection conn = ds.getConnection();
		System.out.println("DBMS 연결성공");
	}
}

