import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloMainSpring {

	public static void main(String[] args) {
		// Greeting Ŭ������ �̸��Ѱ��ְ� ȯ���޽��� ����
		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("beans.xml");
				new FileSystemXmlApplicationContext("beans.xml");
		Greeting gt = (Greeting)context.getBean("gr");
//		Greeting gt = context.getBean(Greeting.class);
		String msg = gt.getMessage();
		//  sysout �Է��� Ctrl+Space
		System.out.println( msg );
	}//end main
}
