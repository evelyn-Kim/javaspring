/** 학생관리 예제 메인 클래스
 * 
 * @author baroq
 *
 */
public class Main01 {

	public static void main(String[] args) {
		//학생정보관리 - 등록,검색(목록,상세,검색),수정,삭제
		// Student(이름, 학과, 학번, 연락처)
		Student s1 = new Student("홍길동","컴공","123123","010-111-2222");
		//클래스내 toString() 재정의하면 변수값을 출력
		System.out.println(s1);
		Student s2 = new Student("김길동","소공","223123","010-222-2222");
		System.out.println(s2);
		// 많은 학생객체를 관리하기위해 매니저를 생성
		IStudentManager sm = new FileStudentManager();
		sm.add( s1 ); //객체저장
		sm.add( s2 ); //객체저장
		int count = sm.getCount(); //저장갯수
		System.out.println("저장갯수: "+count);
	}
}
