package di_01;

public class DBMSLog implements ILog {
	
	private String ip, user, pass;
	
	public DBMSLog(String ip, String user, String pass) {
		System.out.println("DBMSLog 생성");
		this.ip = ip;
		this.user = user;
		this.pass = pass;
	}

	@Override
	public void log(String msg) {
		System.out.println("DBMS출력:"+msg);
	}

}
