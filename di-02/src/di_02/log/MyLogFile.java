package di_02.log;

import org.springframework.stereotype.Component;

/** 파일로 메시지 출력 */
@Component
public class MyLogFile extends MyLog {

	public void log(String message) {
		System.out.println("파일출력:"+message);
	}
}
