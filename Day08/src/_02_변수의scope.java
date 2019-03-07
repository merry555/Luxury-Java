
/*
 * < Scope : (유효)범위 >
 *  - 영역(블록)의 표시는 중괄호를 통해 이루어진다. 
 *  	'{' : 영역의 시작 
 *  	'}' : 영역의 끝(종료)
 *  - 영역 안에 선언된 변수/배열은 해당 영역 안에서만 호출(사용) 가능 
 *  - 속한 영역이 종료되면 변수/배열은 사라진다. (해제된다.)
 *  - A영역이 B영역에 포함되어있을 경우, 
 *    A영역은 B영역의 변수/배열을 사용할 수 있다. 
 *    B영역은 A영역의 변수/배열을 사용할 수 없다.
 */

public class _02_변수의scope {

//	static : 실행 시에 가장 먼저 생성
	
	static int a; 
	int b;
	public static void main(String[] args) {
		
		a =10;
		System.out.println(a);
		
//		에러
//		b = 10;
//		System.out.println(b);
		
		{ int c = 10; }
//		에러 : System.out.println(c);
		
		int d = 100;
		{ System.out.println(d);}
		
		int e;
		int f = 10;
		if(f == 10){
			e = 1;
		} 
		
//		에러 :
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









