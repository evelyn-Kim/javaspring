/**
 * 학생 정보 정의 클래스<br>
 * 이름, 학과, 학번, 연락처
 * @author baroq
 *
 */
public class Student {
	//멤버변수
	private String name, hakgwa, hakbun, tel;
	//생성자
	public Student() {
	}
	public Student(String name, String hakgwa, String hakbun, String tel) {
		super();
		this.name = name;
		this.hakgwa = hakgwa;
		this.hakbun = hakbun;
		this.tel = tel;
	}
	//getter/setter 메서드. 
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
	// toString()을 재정의-Overriding
	// source -> Generate toString()
	@Override
	public String toString() {
		return "Student [name=" + name + ", hakgwa=" + hakgwa + ", hakbun=" + hakbun + ", tel=" + tel + "]";
	}
	
}




