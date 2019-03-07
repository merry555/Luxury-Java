
/*
 * Static : 정적인, 고정되어있는, 움직이지 않는
 *  - 가장 먼저 생성하라 
 *  - (클래스에서) static으로 선언된 멤버 변수는
 *    모든 객체에서 공통으로 사용되는 변수
 *  - static으로 지정된 메소드의 경우, 객체 생성을 하지 않아도 
 *    동작시킬 수 있음 (사용 할 수 있음)
 */
public class _05_Static {

//	실습 : MyMath라는 클래스 정의하고, 그 안에
//	두 수 중 큰 수를 찾는 메소드 구현
/*
 * 		max(정수, 정수) -> 큰 수 반환
 * 		max(실수, 실수) ->  "
 * 		max(실수, 정수) ->  "
 * 		max(정수, 실수) ->  "
 */
	
	public static void main(String[] args) {
		MyMath a = new MyMath(); // 계산을 위해 객체 생성
		System.out.println( a.max(1, 2) );
//		에러 : System.out.println( MyMath.max(1, 2) );
//		우리가 만든 MyMath 클래스는 객체 생성 없이는 
//		메소드를 사용할 수 없었다.
		
		System.out.println( Math.max(1, 2) );
//		Math클래스는 객체 생성 없이도 메소드 사용이 가능하다??
//		이유 : Math소속의 max 메소드는 static 지정되어있어서 그렇다.
		
		System.out.println( MyMath2.max(1, 2));
		
		int aa = Integer.parseInt("3");
		
		
		
//		static을 붙여주는 메소드는 보통
//		값을 저장할 필요가 없거나, 그냥 계산만 하는게 목적일 때 주로 사용한다.
//		why? 객체 생성할 필요가 없어서... 
		
		
		
		
		
		
		
	}
}
