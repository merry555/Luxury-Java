
public class _01_산술연산자 {

	public static void main(String[] args) {
		
//		1. 산술연산자 : +, -, *, /, %
		
//		(1) / : 나눴을 때 나온 '몫'을 알려줌.
//		주의! 정수/정수 => 정수
//		      두 수 중에 적어도 1개가 실수여야 소숫점까지 나온다.
		System.out.println( 5/2 );
		System.out.println( 5.0/2 );
		
//		(2) % : mod 연산자, 나눴을 때 나온 '나머지'를 알려줌.		
		System.out.println( 10%3.0 );
//		c 에서는 나머지 계산은 정수끼리만 가능했지만, JAVA는 실수도 가능하다.
//		용도 : 짝/홀수 구분, 배수 구분, 원하는 범위의 값을 랜덤하게 저장할 때
		
//		(3) 문자열의 덧셈 ( 결합 )
		
		String s1 = "ABC";
		String s2 = "DEF";
		
		System.out.println(s1 + s2);
		
		String s3 = s1 + s2; 
		System.out.println(s3);
		
		s3 = s1 + 10;
		System.out.println(s3);
		
	}
}
