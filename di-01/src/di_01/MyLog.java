package di_01;

public class MyLog implements ILog{
	
	public MyLog() {
		System.out.println("MyLog ����");
	}
	
	public void log(String msg) {
		System.out.println("ȭ�����:"+msg);
	}
}
