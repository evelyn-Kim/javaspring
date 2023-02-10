
public class HelloMain {

	public static void main(String[] args) {
		// Greeting 클래스에 이름넘겨주고 환영메시지 수신
		Greeting gt = new Greeting();
		String msg = gt.getMessage();
		//  sysout 입력후 Ctrl+Space
		System.out.println( msg );
	}//end main
}
