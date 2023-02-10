/**
 * StudentManager가 구현해야하는 메서드만 선언 
 * @author baroq
 *
 */
public interface IStudentManager {
	/** Student를 받아 저장하는 메서드 */
	public void add(Student st);
	/** 현재 저장된 Student의 갯수 반환하는 메서드 */
	public int getCount();
}
