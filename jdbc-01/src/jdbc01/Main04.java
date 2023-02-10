package jdbc01;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		String sql="SELECT count(*) FROM MEMBER";
		int count = template.queryForObject(sql, Integer.class);
		System.out.println("저장된 갯수는 "+count);
		sql="SELECT count(*) FROM MEMBER WHERE mname like ?";
		count = template.queryForObject(sql, Integer.class,"%유저%");
		System.out.println("저장된 갯수는 "+count);
		sql = "select * from member where mid=?";
		Map<String, Object> map = template.queryForMap(sql,"user3");
		System.out.println(map);
		sql = "select * from member";
		List<Map<String,Object>> list = template.queryForList(sql);
		System.out.println(list);
	}
}

