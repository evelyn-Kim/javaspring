package jdbc01;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		String sql="SELECT * FROM MEMBER WHERE mid=?";
		Member mem = template.queryForObject(
				sql, 
				new BeanPropertyRowMapper<Member>(Member.class),
				"user3");
		System.out.println(mem);
	}
}

