package di_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation_01 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans_annotation.xml");
//		Greeting gr = context.getBean(Greeting.class);
//		String msg = gr.getMessage();
//		System.out.println(msg);
//		MyCalc mc = context.getBean(MyCalc.class);
		MyCalc mc = (MyCalc) context.getBean("myCalc");
		mc.plus(10);
		mc.plus(20);
		mc.minus(5);
		System.out.println( mc.getResult() );
	}
}





