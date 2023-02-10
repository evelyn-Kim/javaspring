package jdbc01;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		String sql = "INSERT INTO MEMBER (mid, mname, mpwd, mintro)";
		sql += "VALUES(?,?,?,?)";
		template.update(sql,"user5","유저5","p5","다섯번째유저");
		System.out.println("등록성공");
	}
}

