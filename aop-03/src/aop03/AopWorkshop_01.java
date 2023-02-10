package aop03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopWorkshop_01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans-annotation.xml");
		MyCalc mc = context.getBean(MyCalc.class);
		mc.plus(10); //더하기
		mc.multiple(10); //곱하기  50초과
		mc.minus(60); //빼기
		mc.plus(50);              //50초과
		double result = mc.getResult();  //50초과
		System.out.println("result="+result);
	}//end main
}
