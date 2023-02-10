package di_02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import di_02.log.MyLog;

@Component
@Scope("prototype")
public class Greeting {
	private String name;
	private String message;
	//메시지를 출력(화면, 파일, DBMS, 네트워크)
	@Autowired
	@Qualifier("myLogFile")
	private MyLog log;
	
	public void setLog(MyLog log) {
		this.log = log;
	}
	
	public void setName(String name) {
		log.log(message);
		this.name = name;
	}
	
	public String getMessage() {
		message = "안녕하세요 "+name+"님";
		log.log(message);
		return message;
	}
}
