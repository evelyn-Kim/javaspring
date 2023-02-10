import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloMainSpring {

	public static void main(String[] args) {
		// Greeting 클래스에 이름넘겨주고 환영메시지 수신
		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("beans.xml");
				new FileSystemXmlApplicationContext("beans.xml");
		Greeting gt = (Greeting)context.getBean("gr");
//		Greeting gt = context.getBean(Greeting.class);
		String msg = gt.getMessage();
		//  sysout 입력후 Ctrl+Space
		System.out.println( msg );
	}//end main
}
