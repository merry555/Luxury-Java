
public class _03_���������� {

	public static void main(String[] args) {
		
//		3. ���� ������ : ++ , --
//		�� : a++ �Ǵ� ++a 
//			-> a�� +1 �� �� �ٽ� a�� ���� 
//			-> a = a + 1;
//		�� : a-- �Ǵ� --a 
//		-> a�� -1 �� �� �ٽ� a�� ���� 
//		-> a = a - 1;
		
//		���� �������� �ֿ뵵 : ���� �� �� �ַ� ���
		
		int a = 10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		a--;
		System.out.println(a);
		--a; 
		System.out.println(a);
		
		a = 10;
		int b;
		
		b = ++a;
		System.out.println(b);
		
//		(1)	��ġ���� ( �������� ) 
//			- �ڽ��� ���� ������Ų ��, ������ ������ ����
//		(2) ��ġ���� ( �������� )
//			- ������ ������ ���� ������ ��, �������� �ڽ��� +1 ������
		
		a = 10;
		b = a++;
		System.out.println(b);
		System.out.println(a);
		
		int c = 100;
		System.out.println("���� C�� �� : " + c++ );  // 100
		System.out.println("���� C�� �� : " + ++c );	 // 102
			
	}
}
