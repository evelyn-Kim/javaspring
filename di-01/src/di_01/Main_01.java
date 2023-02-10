package di_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_01 {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		// ���ڿ��� �˻��� ����Ÿ������ ĳ�����ؾ���
//		Greeting gr = (Greeting)context.getBean("gr");  
		// Greeting.class�� �˻��ϸ� �ڵ�ĳ���õ�
		Greeting gr = context.getBean(Greeting.class);  
		
		String msg = gr.getMessage();
		System.out.println(msg);
	}
}





