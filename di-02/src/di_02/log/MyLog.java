package di_02.log;

import org.springframework.stereotype.Component;

/** ȭ������ �޽��� ��� */
@Component
public class MyLog {

	public void log(String message) {
		System.out.println("ȭ�����:"+message);
	}
}
