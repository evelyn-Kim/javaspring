package mybatis02;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybatis.vo.BookVo;


public class BookSpringMain01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		SqlSession session = context.getBean(SqlSession.class);
		//BookVo�� å����(title),���ǻ�(publisher),����(Writer),����(price)�� �����ȴ�.
		BookVo vo = new BookVo("�ڹٱ⺻","�س����ǻ�","����01",22000);
		session.insert("BookMapper.insert", vo);
		System.out.println("��ϼ��� 1");
		
		vo = new BookVo("�ڹٽǹ�","�س����ǻ�","����01",25000);
		session.insert("BookMapper.insert", vo);
		System.out.println("��ϼ��� 2");
		
		vo = new BookVo("�������Թ�","�ϳ����ǻ�","����02",27000);
		session.insert("BookMapper.insert", vo);
		System.out.println("��ϼ��� 3");

		vo = session.selectOne("BookMapper.selectOne", "�ڹٽǹ�");
		System.out.println( "�ڹٽǹ�å����: "+vo );
		
		//�ڹٽǹ�å�� ������ 20000������ ����
		vo.setPrice(20000);
		session.update("BookMapper.update",vo);
		System.out.println( "������ �ڹٽǹ�å����: "+vo );	
	}
}

