
public class _06_Static������� {

	public static void main(String[] args) {
		TestStatic t1 = new TestStatic();
		TestStatic t2 = new TestStatic();
		
		t1.insMsg ="�Ϲ� ������ �ٲ������~~";
		System.out.println("t1 : " + t1.insMsg); // ���� �ٲ�
		System.out.println("t2 : " + t2.insMsg); // �翬�� �ȹٲ�
		
		t1.stMsg = "����ƽ ������ �ٲ������~~";
		System.out.println("t1 : " + t1.stMsg); // �翬�� �ٲ�
		System.out.println("t2 : " + t2.stMsg); // ???????
		
		TestStatic t3 = new TestStatic();
		System.out.println("t3 : " + t3.stMsg); //��� ����ǵ��� �ٲ������
		
//		��� : static�� ���̸� ���� �޸𸮸� �������� ����ϱ� ������ 
//			 �ٸ� ��ü�� ���ؼ� ���� �ٲٸ� ��� ��ü�� static ����� �ٲ��
//			 ȿ���� �� �� �ִ�. 
//		�뵵 : �� �÷��� ������ ����� 
//		-> �÷��̾� ��ü�� ���¸� ��� lose�� �ٲ�� �Ѵ�
//		-> static boolean win; ���� ��������� static���� ������ ��,  
//		-> win = false �� ���� �ڵ带 ���� �ȴ�.
		
		
		
		
		
		
		
		
		
		
	}
}
