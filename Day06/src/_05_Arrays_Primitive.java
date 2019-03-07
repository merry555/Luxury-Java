
public class _05_Arrays_Primitive {

//	< 배열 > : 대량의 데이터를 모아서 저장하는 묶음
//	 - 변수 == 서랍 1칸 , 배열 == 서랍장
//	(1) 원시자료형의 배열 
//		- 원시자료형이란? (primitive type) : int, double, float, long, char
	
//	(2) 객체의 배열
	
	public static void main(String[] args) {
		
//		int 데이터 4개를 저장할 배열을 선언하겠다!
//		에러 : int a[4];
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
		
//		배열의 가장 큰 장점 : 반복문 (for문)을 사용할 수 있다. 
//		double a1, a2, a3, a4, a5;
		double[] b = new double[5];
//		자바에서는 배열을 한꺼번에 초기화 할 수 없다.
		
//		배열명.length : 해당 배열이 몇 칸인지 int형으로 알려줌
		for(int i = 0; i < b.length ; i++){
			b[i] = 3.14;
		}
		
//		확장 for문 (for each문) 
//		for ( 대상 배열의 자료형에 맞게 변수 선언 : 처리할 배열명 )
//		{
//			반복할 문장;
//		}
		for(double d : b){
			System.out.println(d);
		}
		
//		확장 for문 : 배열, 컬렉션에서의 comparable이 적용된 객체 묶음
		
	}
}













