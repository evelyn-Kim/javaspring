import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Workshop02 {
	public static void main(String[] args) {
      ApplicationContext context = 
    		  new ClassPathXmlApplicationContext("calc_beans.xml");
      MyCalc mc = (MyCalc) context.getBean("mc");
      mc.plus(10);
      mc.plus(20);
      mc.minus(5);
      long ans = mc.getResult();
      System.out.println("result="+ans);
      MyCalc mc2 = (MyCalc) context.getBean("mc");
      long ans2 = mc2.getResult();
      System.out.println("result="+ans2);
    }
}
