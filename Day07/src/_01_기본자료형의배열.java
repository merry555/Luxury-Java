
public class _01_�⺻�ڷ����ǹ迭 {

	public static void main(String[] args) {
/*
 * 		< �⺻ �ڷ��� ( ��ü�� ������ �ڷ��� ) >
 * 		ex) int, double, float, char, long, void, ...
 * 		
 * 		< �迭 : Array >
 * 		: '���� �ڷ���' �������� ����
 * 		: '�ݺ���'�� ���� �뷮�� �����͸� �ϰ������� ó���� �� �ִ�.
 * 
 * 		ex) int�� �����͸� 1000 ���� ó���ؾ� �Ѵ�.
 * 		��� 1: ���� 1000�� ���� 
 * 			=> ���� �����, �ݺ����� ����� �� ��� ������ �ڵ��ؾ� ��
 * 		��� 2: 1000ĭ¥�� �迭 1�� ����
 * 			=> �ݺ��� ����� �����ϴ�. 
 */
//		1. �迭 ���� ( double�� 5ĭ¥�� �迭 1�� ���� )
		
//		(1)
		double[] a1 = new double[5];
//		double[5] �迭�� heap�� �����ϰ�(new double[5]),
//		�� �迭�� ������ȣ (�ؽ��ڵ�)�� a1�� �����϶�.
//		�̶�, a1�� double�� �迭�� ���� ������. (double[] a1) 
//		** �� ����� �迭 ������ ���ÿ� �ʱ�ȭ �� �� ����.
		
//		(2)
		double[] a2 = new double[]{1.0, 2.0, 3.0};
//		����� ���ÿ� �ʱ�ȭ�ϴ� ����̸�, 
//		�迭 ���� �� ����( ĭ�� ������ ����)�� ���� �ʴ´�.
//		�߰�ȣ ���ο� �ְ����ϴ� ���Ҹ� �ִ´�. 
//		��ǻ�ʹ� �� ���ҵ��� ������ ���� ĭ�� �Ҵ��Ѵ�. 
//		 => 3ĭ¥�� double�� �迭�� �������.
		
//		(3) 
		double[] a3 = {1.0, 2.0, 3.0, 4.0, 5.0};

//		<����>
		double a4[]; // double[] a4;�� ���� �ǹ�
		
//		=================================================================
		boolean[] b;
//		���� : System.out.println(b);
//		�迭�� ������ �� �ƴ϶�, �迭�� ������ȣ�� ������ �޸��常 ����� ���� ��
//		�Ϲ� ���� ����� �Ȱ���, �ʱ�ȭ������ �ʾ����Ƿ� �����Ⱚ�� ����ִ�.
		
		b = new boolean[4];
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
//		2. �迭 ȣ�� : �迭��[����] ( �� �� ° ĭ���� ���� )
//		������ : 
//		���ȣ ������ ������ �ǹ� 
//			1) �迭 ������ : �� ĭ (����)
//			2) �� �� ��Ȳ : �� �� ° ĭ (�ε���)
		
//		�ǽ� : int�� 6�� ¥�� �迭 1�� ����
//			   Ȯ�� for���� ����Ͽ� ������� 1,2,3,4,5,6 ���� 
//			   ����ǵ��� �غ�����.
		int[] arr = new int[6];
		int x = 1;
//		Ȯ�� for���� �迭�� ������ �� ����.
//		ȣ�⸸ �����ϴ�.
		for(int ii : arr){
			ii = x;
			x++;
			System.out.println(ii);
		}
		System.out.println("==============");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		
		int y = 1;
		for(int ii = 0; ii < arr.length; ii++){
			arr[ii] = y;
			y++;
		}
		System.out.println("==============");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
	}
}










