
public class _01_기본자료형의배열 {

	public static void main(String[] args) {
/*
 * 		< 기본 자료형 ( 객체를 제외한 자료형 ) >
 * 		ex) int, double, float, char, long, void, ...
 * 		
 * 		< 배열 : Array >
 * 		: '같은 자료형' 변수들의 집합
 * 		: '반복문'을 통해 대량의 데이터를 일괄적으로 처리할 수 있다.
 * 
 * 		ex) int형 데이터를 1000 개를 처리해야 한다.
 * 		방법 1: 변수 1000개 선언 
 * 			=> 선언도 힘들고, 반복문을 사용할 수 없어서 일일히 코딩해야 함
 * 		방법 2: 1000칸짜리 배열 1개 선언
 * 			=> 반복문 사용이 가능하다. 
 */
//		1. 배열 선언 ( double형 5칸짜리 배열 1개 선언 )
		
//		(1)
		double[] a1 = new double[5];
//		double[5] 배열을 heap에 생성하고(new double[5]),
//		이 배열의 고유번호 (해시코드)를 a1에 저장하라.
//		이때, a1은 double형 배열을 위한 변수다. (double[] a1) 
//		** 위 방법은 배열 생성과 동시에 초기화 할 수 없다.
		
//		(2)
		double[] a2 = new double[]{1.0, 2.0, 3.0};
//		선언과 동시에 초기화하는 방법이며, 
//		배열 생성 시 숫자( 칸의 개수를 지정)를 넣지 않는다.
//		중괄호 내부에 넣고자하는 원소를 넣는다. 
//		컴퓨터는 이 원소들의 개수를 세서 칸을 할당한다. 
//		 => 3칸짜리 double형 배열이 만들어짐.
		
//		(3) 
		double[] a3 = {1.0, 2.0, 3.0, 4.0, 5.0};

//		<참고>
		double a4[]; // double[] a4;와 같은 의미
		
//		=================================================================
		boolean[] b;
//		에러 : System.out.println(b);
//		배열을 생성한 게 아니라, 배열의 고유번호를 저장할 메모장만 만들어 놓은 셈
//		일반 변수 선언과 똑같이, 초기화해주지 않았으므로 쓰레기값이 들어있다.
		
		b = new boolean[4];
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
//		2. 배열 호출 : 배열명[정수] ( 몇 번 째 칸인지 지정 )
//		주의점 : 
//		대괄호 내부의 숫자의 의미 
//			1) 배열 생성시 : 몇 칸 (개수)
//			2) 그 외 상황 : 몇 번 째 칸 (인덱스)
		
//		실습 : int형 6개 짜리 배열 1개 생성
//			   확장 for문을 사용하여 순서대로 1,2,3,4,5,6 값이 
//			   저장되도록 해보세요.
		int[] arr = new int[6];
		int x = 1;
//		확장 for문은 배열을 저장할 수 없다.
//		호출만 가능하다.
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










