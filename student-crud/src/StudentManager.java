import java.util.ArrayList;

/**
 * �л������� �����ϴ� Ŭ����
 * @author baroq
 *
 */
public class StudentManager implements IStudentManager{
	//������ ���� �÷��� ����
	private ArrayList<Student> stdents = new ArrayList<Student>();

	public void add(Student s1) {
		stdents.add(s1);
	}
	/** ����� �л� ���� ��ȯ */
	public int getCount() {
		return stdents.size();
	}
}
