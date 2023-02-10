import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Workshop03 {
	public static void main(String[] args) {
      ApplicationContext context = 
    		  new ClassPathXmlApplicationContext("calc_beans.xml");
      MyLotto lotto = (MyLotto) context.getBean("mylotto");
      lotto.makeLotto(); // ���������� 1~45 �ߺ����� �ʴ� 6����ȣ����,���� 
      ArrayList<Integer> nums=lotto.getLotto();
      System.out.println("�̹��� �ζǹ�ȣ�� "+nums);
    }
}