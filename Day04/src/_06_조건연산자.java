

public class _06_���ǿ����� {

//	(6) ���ǿ����� (== ���׿�����)
//	���� :  ���ǽ� ? ���� ��� ���� �� : ������ ��� ���� �� ;

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int max = a > b ? a : b ;
		System.out.println(max);
		
		// �ǽ� : age ���� ���Ƿ� ������ ��, 
		// 19 ���� -> �̼����� , �ƴϸ� ������ str�� �����ϰ� ���
		int age = 15;
		String str;
		str = age <= 19 ? "�̼�����" : "����";
		
		System.out.println(str);
		
	}
}
