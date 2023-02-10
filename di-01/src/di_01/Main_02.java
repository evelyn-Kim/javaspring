package di_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_02 {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		MyCalc mc = context.getBean(MyCalc.class);
		mc.plus(10);
		mc.plus(20);
		mc.minus(5);
		double r = mc.getResult();
		System.out.println(r);
		///// 새로운 빈 추출
		MyCalc mc2 = context.getBean(MyCalc.class);
		double r2 = mc2.getResult();
		System.out.println(r2);
	}//end main

}
