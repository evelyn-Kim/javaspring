package di_01;

public class Greeting {
	private String name;
	private ILog log ;
	
	public Greeting() {
		System.out.println("Greeting 생성");
	}
	
	public void setLog(ILog log) {
		this.log = log;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		log.log("이름설정:"+name); // 파일출력, DBMS에 저장, 네트워크서버 전송
		this.name = name;
	}

	public String getMessage() {
		// 출력메시지를 따로 출력
		String msg = "안녕하세요 "+name+"님";
		log.log( msg );
		return msg;
	}
}
