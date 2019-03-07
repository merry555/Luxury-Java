

public class _06_조건연산자 {

//	(6) 조건연산자 (== 삼항연산자)
//	형식 :  조건식 ? 참일 경우 선택 값 : 거짓일 경우 선택 값 ;

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int max = a > b ? a : b ;
		System.out.println(max);
		
		// 실습 : age 값을 임의로 저장한 뒤, 
		// 19 이하 -> 미성년자 , 아니면 성인을 str에 저장하고 출력
		int age = 15;
		String str;
		str = age <= 19 ? "미성년자" : "성인";
		
		System.out.println(str);
		
	}
}
