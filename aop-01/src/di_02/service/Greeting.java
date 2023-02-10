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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		message = "æ»≥Á«œººø‰ "+name+"¥‘";
		return message;
	}
}
