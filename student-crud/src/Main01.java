/** �л����� ���� ���� Ŭ����
 * 
 * @author baroq
 *
 */
public class Main01 {

	public static void main(String[] args) {
		//�л��������� - ���,�˻�(���,��,�˻�),����,����
		// Student(�̸�, �а�, �й�, ����ó)
		Student s1 = new Student("ȫ�浿","�İ�","123123","010-111-2222");
		//Ŭ������ toString() �������ϸ� �������� ���
		System.out.println(s1);
		Student s2 = new Student("��浿","�Ұ�","223123","010-222-2222");
		System.out.println(s2);
		// ���� �л���ü�� �����ϱ����� �Ŵ����� ����
		IStudentManager sm = new FileStudentManager();
		sm.add( s1 ); //��ü����
		sm.add( s2 ); //��ü����
		int count = sm.getCount(); //���尹��
		System.out.println("���尹��: "+count);
	}
}
