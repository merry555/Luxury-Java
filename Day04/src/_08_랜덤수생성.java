
public class _08_���������� {

	public static void main(String[] args) {
		
//		< ���� �� ���� (���� ����) >
//		Math.random() : 0.0 ~ 0.999999999 ������ �Ǽ��� �����ϰ� ���´�.
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		
//		0~9���� ���� �����ϰ� ����ϰ� �;� ...
		System.out.println( (int)(Math.random()*10) );
		
//		1~10���� ���� �����ϰ� ����ϰ� �;� ...
		System.out.println( (int)(Math.random()*10) + 1 );
		
//		1~6 ���� ���� �����ϰ� ����ϰ� �;� ...
		System.out.println( (int)(Math.random()*6) + 1 );
		
//		�ǽ� : 2~9�� �������� �����ϰ� ���
		int a, b;
		a = (int)(Math.random()*8)+2; // 2 ~ 9 �� ���� 
		b = (int)(Math.random()*8)+2; // 2 ~ 9 �� ���� 
		
//		��� �� :  5 x 4 = 20 ������ �����ϰ� ������ ��.
		System.out.println( a + " x " + b + " = " + a*b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
