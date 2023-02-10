import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main01 {
	public static void main(String[] args) {
      ApplicationContext context = 
    		  new ClassPathXmlApplicationContext("beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      System.out.println(obj.getMessage());
	}
}
