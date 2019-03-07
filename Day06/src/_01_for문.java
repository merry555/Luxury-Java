
public class _01_for문 {

	public static void main(String[] args) {
		
//		1. for문 : 보통 횟수를 지정하여 반복하고자 하는 상황에서 사용 
//				   배열에서도 자주 사용
		
//		for (초기식; 조건식 ; 증감식) {
//			반복할 문장; 
//			반복할 문장2;
//			... (종속문장)
//		}
		
//		1 ~ 10 까지 출력하겠다!
		
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}
//		1. 초기식 
//		2. 조건식 ( true, false 판단 )
//		3. 조건식이 true면 종속문장 실행
//		4. 증감식 
//		5. 조건식 -> 종속문장 실행 -> 증감
//		6. 조건식이 false라면 for문은 종료된다.
		
		System.out.println("===========================");
		
//		실습 : 30 ~ 100까지의 총합을 구하세요..
//		30 + 31 + 32 + 33 + 34 + ... + 100
		
		int sum = 0;
		for(int i = 30; i<=100; i++){
			sum += i;
		}
		System.out.println(sum);
		
	}
}
















