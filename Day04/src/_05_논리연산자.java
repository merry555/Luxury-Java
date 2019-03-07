
public class _05_논리연산자 {

	public static void main(String[] args) {
		
//		5. 논리연산자 : && , || , ! => boolean 형태로 결과 나옴 
		
//		(1) && : 논리곱연산자 ( 논리 AND 연산자 )
//		 - 양 수식이 모두 참이어야 true
//		 - 하나라도 거짓이면 false
		
//		(2) || : 논리합연산자 ( 논리 OR 연산자 )
//		 - 양 수식 중 하나라도 참이면 true
//		 - 두 수식 모두 거짓이어야 false 
		
		boolean a = 10 < 20 && 15 < -5; // false 
		a = 10 > 20 && 15 < -5; 
		// '&& 연산자'는 앞 수식이 '거짓'이면 다음 수식은 쳐다보지도 않는다
		System.out.println(a);
		
		
		a = 10 < 20 || 15 < -5;	// true
		// '|| 연산자'는 앞 수식이 '참'이면 다음 수식은 쳐다보지도 않는다
		System.out.println(a);
		
		long l = 1;
		a = l > 10 && ++l == 2;
		System.out.println(l); // ++ 실행 되지 않은 것을 확인
		
//		(3) ! : 논리부정연산자 ( 논리 NOT 연산자 )
//		- 수식이 참이면 false를, 거짓이면 true 반환
		
		boolean b = !(10 == 20);
		System.out.println(b);
		
		
		
		
		
		
		
		
		
	}
}
