
public class _07_Cast������ {

	public static void main(String[] args) {
//		7. Cast������ ( ����ȯ������ )
//		- Casting�̶�? �������� �ڷ����� �ٲٴ� ��
//		- ���� ����ȯ : �����ڰ� ���ϴ� ��� ( ������ ) ����ȯ => Cast������ ���
//		- �ڵ� ����ȯ : ��ǻ�Ͱ� �ڵ����� (��¿ �� ���� ��Ȳ����) ����ȯ
		// 3, 3.0 
		double d; 
		d = 3;	// 3.0 ����ȯ �� ��, d�� ���� ( �ڵ� ����ȯ )
		System.out.println(d);
		
		
//		Cast������ ���� : (���ϴ� �ڷ���)�ٲ� ������
		int i = (int)3.14;
//		3.14�� int������ ���� casting�ϰ�, �׸� i�� �����ϰڴ�.
		System.out.println(i);
		
		System.out.println( (int)'A' ); // 65
//		why ? A�� �������� (ASCII�ڵ� ��)�� 65�̱⶧��!
		
//		����ȯ �ֿ뵵 : int�� �����͸� �Ǽ������� �ٲ� ��
		int kr = 60;
		int en = 60;
		int ma = 61;
		
//		�ǽ� : ����� 60.2 �̻��̸� �հ�! �׷��� ������ ���հ�!�� ���
		
		String msg;
//		���ǿ����� ��� 
		msg = (double)(kr + en + ma) / 3 >= 60.2 ? "�հ�" : "���հ�" ;
		
		System.out.println(msg);
		
	}
}
