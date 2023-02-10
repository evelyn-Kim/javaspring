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
//		session.close();//���Ǵݱ�
//		System.out.println( vo );
		
//		SqlSession session = context.getBean(SqlSession.class);
//		MemberVo vo = new MemberVo("user103","����103","p103","�鼼��° ����");
//		session.insert("insert", vo);
//		System.out.println("��ϼ���");
		
		// user100�� mintro���� "-����" ���ڸ� ���̴� �ڵ带 �ۼ��ϼ���.
		// ���ۼ���, �׽�Ʈ�ڵ� �ۼ��غ�����.
		// ���� �׽�Ʈ
		SqlSession session = context.getBean(SqlSession.class);
		MemberVo vo = session.selectOne("selectOne","user100");
		if( vo != null ) {
			vo.setMintro(vo.getMintro()+"-����");
			session.update("update", vo);
			System.out.println("�����Ϸ�");
		}
	}//end main
}










