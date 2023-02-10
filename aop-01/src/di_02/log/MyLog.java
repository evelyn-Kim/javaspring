package di_02.log;

import org.springframework.stereotype.Component;

/** 화면으로 메시지 출력 */
@Component
public class MyLog {

	public void log(String message) {
		System.out.println("화면출력:"+message);
	}
}
