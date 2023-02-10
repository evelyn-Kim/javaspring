package jdbc02;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DataSource dataSource = context.getBean(DataSource.class);
		Connection connection = dataSource.getConnection();
		System.out.println("DB연결성공!");
	}

}
