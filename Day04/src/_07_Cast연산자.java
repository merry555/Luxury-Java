
public class _07_Cast연산자 {

	public static void main(String[] args) {
//		7. Cast연산자 ( 형변환연산자 )
//		- Casting이란? 데이터의 자료형을 바꾸는 것
//		- 강제 형변환 : 개발자가 원하는 대로 ( 강제로 ) 형변환 => Cast연산자 사용
//		- 자동 형변환 : 컴퓨터가 자동으로 (어쩔 수 없는 상황에서) 형변환
		// 3, 3.0 
		double d; 
		d = 3;	// 3.0 형변환 된 뒤, d에 저장 ( 자동 형변환 )
		System.out.println(d);
		
		
//		Cast연산자 형식 : (원하는 자료형)바꿀 데이터
		int i = (int)3.14;
//		3.14를 int형으로 강제 casting하고, 그를 i에 저장하겠다.
		System.out.println(i);
		
		System.out.println( (int)'A' ); // 65
//		why ? A의 정수값이 (ASCII코드 값)이 65이기때문!
		
//		형변환 주용도 : int형 데이터를 실수형으로 바꿀 때
		int kr = 60;
		int en = 60;
		int ma = 61;
		
//		실습 : 평균이 60.2 이상이면 합격! 그렇지 않으면 불합격!을 출력
		
		String msg;
//		조건연산자 사용 
		msg = (double)(kr + en + ma) / 3 >= 60.2 ? "합격" : "불합격" ;
		
		System.out.println(msg);
		
	}
}
