package di_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_02.service.Greeting;

public class Main_01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Greeting gr = context.getBean(Greeting.class);
		gr.setName("�迵ȯ");
		String msg = gr.getMessage();
		System.out.println(msg);
	}//end main
}
