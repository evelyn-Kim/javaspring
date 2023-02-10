package mybatis01;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.vo.MemberVo;


public class Main01 {

	public static void main(String[] args) throws Exception {
		String resource = "mybatis/config/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//		try (SqlSession session = sqlSessionFactory.openSession()) {
//		  MemberVo vo = session.selectOne("MemberMapper.selectOne", "user100");
//		  System.out.println( vo );
//		}

//		//��� ����
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//		  List<MemberVo> mlist = session.selectList("selectAll");
//		  System.out.println("** ��ü��� **");
//		  for (MemberVo vo : mlist) {
//			System.out.println(vo);
//		  }//end for
//		}//end try
		
		//���
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
		  MemberVo vo = new MemberVo("user101","����101","p101","���ѹ�° ����");
		  session.insert("insert", vo);
		  System.out.println("��ϼ���");
		}
		
	}//end main
}








