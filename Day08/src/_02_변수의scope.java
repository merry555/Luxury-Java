
/*
 * < Scope : (��ȿ)���� >
 *  - ����(���)�� ǥ�ô� �߰�ȣ�� ���� �̷������. 
 *  	'{' : ������ ���� 
 *  	'}' : ������ ��(����)
 *  - ���� �ȿ� ����� ����/�迭�� �ش� ���� �ȿ����� ȣ��(���) ���� 
 *  - ���� ������ ����Ǹ� ����/�迭�� �������. (�����ȴ�.)
 *  - A������ B������ ���ԵǾ����� ���, 
 *    A������ B������ ����/�迭�� ����� �� �ִ�. 
 *    B������ A������ ����/�迭�� ����� �� ����.
 */

public class _02_������scope {

//	static : ���� �ÿ� ���� ���� ����
	
	static int a; 
	int b;
	public static void main(String[] args) {
		
		a =10;
		System.out.println(a);
		
//		����
//		b = 10;
//		System.out.println(b);
		
		{ int c = 10; }
//		���� : System.out.println(c);
		
		int d = 100;
		{ System.out.println(d);}
		
		int e;
		int f = 10;
		if(f == 10){
			e = 1;
		} 
		
//		���� :
//		else if( f != 10){
//			e = -1;
//		}
//		System.out.println(e);
		
		else {
			e = -1;
		}
		System.out.println(e);
		
		
		
	}
	
}









