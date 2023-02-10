package di_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_01 {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		// 문자열로 검색시 원래타입으로 캐스팅해야함
//		Greeting gr = (Greeting)context.getBean("gr");  
		// Greeting.class로 검색하면 자동캐스팅됨
		Greeting gr = context.getBean(Greeting.class);  
		
		String msg = gr.getMessage();
		System.out.println(msg);
	}
}





