
public class _01_��������� {

	public static void main(String[] args) {
		
//		1. ��������� : +, -, *, /, %
		
//		(1) / : ������ �� ���� '��'�� �˷���.
//		����! ����/���� => ����
//		      �� �� �߿� ��� 1���� �Ǽ����� �Ҽ������� ���´�.
		System.out.println( 5/2 );
		System.out.println( 5.0/2 );
		
//		(2) % : mod ������, ������ �� ���� '������'�� �˷���.		
		System.out.println( 10%3.0 );
//		c ������ ������ ����� ���������� ����������, JAVA�� �Ǽ��� �����ϴ�.
//		�뵵 : ¦/Ȧ�� ����, ��� ����, ���ϴ� ������ ���� �����ϰ� ������ ��
		
//		(3) ���ڿ��� ���� ( ���� )
		
		String s1 = "ABC";
		String s2 = "DEF";
		
		System.out.println(s1 + s2);
		
		String s3 = s1 + s2; 
		System.out.println(s3);
		
		s3 = s1 + 10;
		System.out.println(s3);
		
	}
}
