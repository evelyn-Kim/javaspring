package jdbc02;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		String sql = "insert into member(mid, mname, mpwd, mintro)";
		sql += "values(?,?,?,?)";
		jdbcTemplate.update(sql,"user100","유저100","pwd100","백전째 유저");
		System.out.println("등록성공!");
	}
}
