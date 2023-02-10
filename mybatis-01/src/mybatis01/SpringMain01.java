package mybatis01;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybatis.vo.MemberVo;

public class SpringMain01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		SqlSessionFactory sqlSessionFactory = context.getBean(SqlSessionFactory.class);
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//		  MemberVo vo = session.selectOne("MemberMapper.selectOne", "user100");
//		  System.out.println( vo );
//		}

//		SqlSession session = context.getBean(SqlSession.class);
//		MemberVo vo = session.selectOne("MemberMapper.selectOne", "user100");
//		session.close();//세션닫기
//		System.out.println( vo );
		
//		SqlSession session = context.getBean(SqlSession.class);
//		MemberVo vo = new MemberVo("user103","유저103","p103","백세번째 유저");
//		session.insert("insert", vo);
//		System.out.println("등록성공");
		
		// user100의 mintro끝에 "-수정" 글자를 붙이는 코드를 작성하세요.
		// 매퍼수정, 테스트코드 작성해보세요.
		// 수정 테스트
		SqlSession session = context.getBean(SqlSession.class);
		MemberVo vo = session.selectOne("selectOne","user100");
		if( vo != null ) {
			vo.setMintro(vo.getMintro()+"-수정");
			session.update("update", vo);
			System.out.println("수정완료");
		}
	}//end main
}










