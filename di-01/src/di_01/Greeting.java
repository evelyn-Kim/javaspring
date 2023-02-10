package di_01;

public class Greeting {
	private String name;
	private ILog log ;
	
	public Greeting() {
		System.out.println("Greeting ����");
	}
	
	public void setLog(ILog log) {
		this.log = log;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		log.log("�̸�����:"+name); // �������, DBMS�� ����, ��Ʈ��ũ���� ����
		this.name = name;
	}

	public String getMessage() {
		// ��¸޽����� ���� ���
		String msg = "�ȳ��ϼ��� "+name+"��";
		log.log( msg );
		return msg;
	}
}
