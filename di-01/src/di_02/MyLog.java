package di_02;

import org.springframework.stereotype.Component;

@Component
public class MyLog {

	public void log(String string) {
		System.out.println("ȭ�����:"+string);
	}
}
