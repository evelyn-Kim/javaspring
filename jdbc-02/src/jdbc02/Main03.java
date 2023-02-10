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
		// 1개숫자나 문자를 가져올때
		//		String sql = "select count(*) from member";
//		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
//		System.out.println("저장갯수="+count);
		
//		//1개행을 가져올때
//		String sql = "select * from MEMBER where mid=?";
//		Map<String, Object> mem = jdbcTemplate.queryForMap(sql,"user100");
//		// 대문자 칼럼명이 키
//		System.out.println(mem.get("MID"));
//		System.out.println(mem.get("MNAME"));
//		System.out.println(mem);
//		// 전체 데이터를 모두 추출
//		List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from MEMBER");
//		System.out.println("** 전체출력 **");
//		for (Map<String, Object> map : list) {
//			System.out.println(map);
//		}
//		// 1개 데이터를 VO에 자동저장하기
//		String sql = "select * from MEMBER where mid=?";
//		MemberVo vo = jdbcTemplate.queryForObject(
//				sql, 
//				new BeanPropertyRowMapper<MemberVo>(MemberVo.class)
//				,"user100");
//		System.out.println("VO="+vo);
		//여러행을 Vo 리스트에 저장하기
		String sql = "select * from member ORDER BY mid ASC";
		List<MemberVo> mlist = jdbcTemplate.query(
				sql, 
				new BeanPropertyRowMapper<MemberVo>(MemberVo.class)
				);
		System.out.println("** 전체출력 **");
		for (MemberVo vo : mlist) {
			System.out.println(vo);
		}//end for
	}//end main
}





