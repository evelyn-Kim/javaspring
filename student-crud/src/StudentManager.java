import java.util.ArrayList;

/**
 * 학생정보를 관리하는 클래스
 * @author baroq
 *
 */
public class StudentManager implements IStudentManager{
	//저장을 위한 컬렉션 변수
	private ArrayList<Student> stdents = new ArrayList<Student>();

	public void add(Student s1) {
		stdents.add(s1);
	}
	/** 저장된 학생 갯수 반환 */
	public int getCount() {
		return stdents.size();
	}
}
