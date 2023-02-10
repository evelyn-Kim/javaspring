import java.util.ArrayList;

/**
 * 학생정보를 파일에 관리하는 클래스
 * @author baroq
 *
 */
public class FileStudentManager implements IStudentManager {
	//저장을 위한 컬렉션 변수
	private ArrayList<Student> stdents = new ArrayList<Student>();

	public void add(Student s1) {
		System.out.println("파일에 추가");
		stdents.add(s1);
	}
	/** 저장된 학생 갯수 반환 */
	public int getCount() {
		System.out.println("파일에서 추출");
		return stdents.size();
	}
}
