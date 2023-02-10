package jdbc02;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import jdbc02.vo.MemberVo;

public class Main03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		// 1�����ڳ� ���ڸ� �����ö�
		//		String sql = "select count(*) from member";
//		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
//		System.out.println("���尹��="+count);
		
//		//1������ �����ö�
//		String sql = "select * from MEMBER where mid=?";
//		Map<String, Object> mem = jdbcTemplate.queryForMap(sql,"user100");
//		// �빮�� Į������ Ű
//		System.out.println(mem.get("MID"));
//		System.out.println(mem.get("MNAME"));
//		System.out.println(mem);
//		// ��ü �����͸� ��� ����
//		List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from MEMBER");
//		System.out.println("** ��ü��� **");
//		for (Map<String, Object> map : list) {
//			System.out.println(map);
//		}
//		// 1�� �����͸� VO�� �ڵ������ϱ�
//		String sql = "select * from MEMBER where mid=?";
//		MemberVo vo = jdbcTemplate.queryForObject(
//				sql, 
//				new BeanPropertyRowMapper<MemberVo>(MemberVo.class)
//				,"user100");
//		System.out.println("VO="+vo);
		//�������� Vo ����Ʈ�� �����ϱ�
		String sql = "select * from member ORDER BY mid ASC";
		List<MemberVo> mlist = jdbcTemplate.query(
				sql, 
				new BeanPropertyRowMapper<MemberVo>(MemberVo.class)
				);
		System.out.println("** ��ü��� **");
		for (MemberVo vo : mlist) {
			System.out.println(vo);
		}//end for
	}//end main
}





