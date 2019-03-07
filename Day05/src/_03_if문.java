
public class _03_if문 {

	public static void main(String[] args) {
//		< 제어문이란 : 프로그램 흐름을 제어하는 키워드(단어) >
		
		
//		1. if문 : 조건이 참 => 종속문장 실행
//				  		거짓 => 종속문장 실행하지 않고 건너뜀.
//		0~9 까지 랜덤값을 뽑고, 짝수인지 알고 싶다
//		(조건연산자를 통해서도 할 수 있지만, if문을 통해서도 표현할 수 있다.)
		
		/*
		 * if(조건식){
		 * 	종속문장1;
		 *	종속문장2; 
		 *  ...
		 * }
		 */
		 
//		 1-2. else 문 : 상위 if문의 짝꿍이며, 짝꿍 if문의 조건이 '거짓'이면
//						무조건 실행하도록 하는 키워드
//			주의점 ! (1) if문 없이는 사용 불가
//					(2) 조건식이 없다.

		int s1 = (int)(Math.random()*10);
		if(s1 % 2 == 0){
			System.out.println(s1 + "은(는) 짝수입니다.");
		} else {
			System.out.println(s1 + "은(는) 홀수입니다.");
		}
		
		
//		1-3. 다중 if문 : 
//			여러 조건을 걸어 두고, 이 중 1개만 선택하도록 하고 싶을 때
		
//		1~5까지 랜덤 수를 생성하고, 다중 if문을 사용해보자!
		int s2 = (int)(Math.random()*5)+1;
		
		if(s2 == 1){
			System.out.println("s2는 1 입니다.");
		} else if(s2 == 2){
			System.out.println("s2는 2입니다.");
		} else if(s2 == 3){
			System.out.println("s2는 3입니다.");
		} else if(s2 == 4){
			System.out.println("s2는 4입니다.");
		} else if (s2 == 5){
			System.out.println("s2는 5입니다.");
		} // 이중에 최대 1개의 조건만 실행된다.
		
		
		
	}
}
