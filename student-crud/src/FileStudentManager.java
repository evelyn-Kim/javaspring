import java.util.ArrayList;

/**
 * �л������� ���Ͽ� �����ϴ� Ŭ����
 * @author baroq
 *
 */
public class FileStudentManager implements IStudentManager {
	//������ ���� �÷��� ����
	private ArrayList<Student> stdents = new ArrayList<Student>();

	public void add(Student s1) {
		System.out.println("���Ͽ� �߰�");
		stdents.add(s1);
	}
	/** ����� �л� ���� ��ȯ */
	public int getCount() {
		System.out.println("���Ͽ��� ����");
		return stdents.size();
	}
}
