/**
 * �л� ���� ���� Ŭ����<br>
 * �̸�, �а�, �й�, ����ó
 * @author baroq
 *
 */
public class Student {
	//�������
	private String name, hakgwa, hakbun, tel;
	//������
	public Student() {
	}
	public Student(String name, String hakgwa, String hakbun, String tel) {
		super();
		this.name = name;
		this.hakgwa = hakgwa;
		this.hakbun = hakbun;
		this.tel = tel;
	}
	//getter/setter �޼���. 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHakgwa() {
		return hakgwa;
	}
	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	// toString()�� ������-Overriding
	// source -> Generate toString()
	@Override
	public String toString() {
		return "Student [name=" + name + ", hakgwa=" + hakgwa + ", hakbun=" + hakbun + ", tel=" + tel + "]";
	}
	
}




