package di_02.log;

import org.springframework.stereotype.Component;

/** ���Ϸ� �޽��� ��� */
@Component
public class MyLogFile extends MyLog {

	public void log(String message) {
		System.out.println("�������:"+message);
	}
}
