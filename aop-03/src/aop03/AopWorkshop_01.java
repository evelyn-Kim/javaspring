package aop03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopWorkshop_01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans-annotation.xml");
		MyCalc mc = context.getBean(MyCalc.class);
		mc.plus(10); //���ϱ�
		mc.multiple(10); //���ϱ�  50�ʰ�
		mc.minus(60); //����
		mc.plus(50);              //50�ʰ�
		double result = mc.getResult();  //50�ʰ�
		System.out.println("result="+result);
	}//end main
}
