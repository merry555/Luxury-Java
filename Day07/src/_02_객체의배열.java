import javax.swing.JOptionPane;

// ���ο� Ŭ����
public class _02_��ü�ǹ迭 {

	public static void main(String[] args) {
		// Person ��ü�� �迭 
		
		// �迭 ���� - �޸��� ����
 		Person[] p;
 		
 		p = new Person[4];
// 		Person 4��¥�� �迭 ����
 		System.out.println(p);
 		System.out.println(p[0]);	// null
 		System.out.println(p[1]);   // null
 		
// 		���� :
// 		p[0].age = 10;
// 		System.out.println(p[0].age);
 		
// 		���� ! Ŭ���� �迭 ������ ������(���۷���) �迭�� �����Ǵ� ��
// 		���� ���� �������� ���� �ƴϴ�. 
 		
// 		�ݵ�� ��ü ���� �۾��� �־�� �Ѵ�.
 		p[0] = new Person();
 		p[1] = new Person();
 		p[2] = new Person();
 		p[3] = new Person();
 		
 		p[0].age = 10;
		System.out.println(p[0].age);
 		
//		�ǽ� : jop, for�� ���
//		�̸�, ����, �ڵ��������� �Է� �ް�, ��� ��ü�� ����
//		��� : �ڵ����� �ֽ��ϱ�? (Y/N) 
//		�Է� : Y -> hasPhone = true
//			   N -> hasPhone = false 
//		for(int i = 0; i<p.length ; i++){
//			p[i].name = JOptionPane.showInputDialog(i + 1 + "�� ° �̸�");
//			String age = JOptionPane.showInputDialog("����");
//			p[i].age = Integer.parseInt(age);
//			String hasPhone = JOptionPane.showInputDialog("�ڵ��� (Y/N)");
//			if(hasPhone.equals("Y")){
//				p[i].hasPhone = true;
//			} else {
//				p[i].hasPhone = false;
//			}
//		}
//		
//		String shwMsg = "";	// �ʱ�ȭ 
//		for(int i = 0; i<p.length; i++)
//		{
//			shwMsg += i+1 + "��\n" 
//					+ "�̸� : " + p[i].name + "\n"
//					+ "���� : " + p[i].age + "\n"
//					+ "�ڵ��� ���� : " + p[i].hasPhone + "\n"
//					+ "============== \n";
//		}
//		JOptionPane.showMessageDialog(null, shwMsg);
		
//		String a = null;
//		a += "ABC";
//		System.out.println(a);
//		String b = "";
//		b += "ABC";
//		System.out.println(b);
		
		int i = 1;
		for(Person s : p){
			s.name = JOptionPane.showInputDialog(i++ + "�� ° �̸�");
			String age = JOptionPane.showInputDialog("����");
			s.age = Integer.parseInt(age);
			String hasPhone = JOptionPane.showInputDialog("�ڵ��� (Y/N)");
			if(hasPhone.equals("Y")){
				s.hasPhone = true;
			} else {
				s.hasPhone = false;
			}
		}
		
		String shwMsg = "";	// �ʱ�ȭ 
		for(Person s : p)
		{
			shwMsg += i+1 + "��\n" 
					+ "�̸� : " + s.name + "\n"
					+ "���� : " + s.age + "\n"
					+ "�ڵ��� ���� : " + s.hasPhone + "\n"
					+ "============== \n";
		}
		JOptionPane.showMessageDialog(null, shwMsg);
	}
}
/*
 * Ȯ�� for�� 
 * 	- �б� ����
 * 	- �迭�� ���� �ٲ��� �� ����
 * 	- ��ü�� �迭�̶��, �迭�� ���� �����Ͽ� �������(��) ���� �ٲ��� �� �ִ�.
 */
























