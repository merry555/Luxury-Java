
public class _05_Arrays_Primitive {

//	< �迭 > : �뷮�� �����͸� ��Ƽ� �����ϴ� ����
//	 - ���� == ���� 1ĭ , �迭 == ������
//	(1) �����ڷ����� �迭 
//		- �����ڷ����̶�? (primitive type) : int, double, float, long, char
	
//	(2) ��ü�� �迭
	
	public static void main(String[] args) {
		
//		int ������ 4���� ������ �迭�� �����ϰڴ�!
//		���� : int a[4];
		int[] a = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
//		�迭�� ���� ū ���� : �ݺ��� (for��)�� ����� �� �ִ�. 
//		double a1, a2, a3, a4, a5;
		double[] b = new double[5];
//		�ڹٿ����� �迭�� �Ѳ����� �ʱ�ȭ �� �� ����.
		
//		�迭��.length : �ش� �迭�� �� ĭ���� int������ �˷���
		for(int i = 0; i < b.length ; i++){
			b[i] = 3.14;
		}
		
//		Ȯ�� for�� (for each��) 
//		for ( ��� �迭�� �ڷ����� �°� ���� ���� : ó���� �迭�� )
//		{
//			�ݺ��� ����;
//		}
		for(double d : b){
			System.out.println(d);
		}
		
//		Ȯ�� for�� : �迭, �÷��ǿ����� comparable�� ����� ��ü ����
		
	}
}













