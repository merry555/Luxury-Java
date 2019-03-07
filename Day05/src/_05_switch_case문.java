
public class _05_switch_case문 {

	public static void main(String[] args) {
//		2. switch-case : 
//		조건 값에 맞는 case 레이블을 찾아가서 실행시키는 키워드
//		다중 if문으로 대체가 가능하다. 
		
//		주의점 ! case 에는 실수를 지정할 수 없다. 
//		case 3.14: (X)
//		case 1.0: (X) 
//		case "ABC": (O) 자바에서는 문자열 레이블 가능 
		
		int a = (int)(Math.random()*1000)+1; // 1 ~ 1000까지 랜덤
		switch(a%2){
		case 0 : 	// 끝에 : 이 있다면, 이는 레이블이라고 한다. 
					// 레이블은 책갈피 역할을 한다. 
			System.out.println(a + " 은(는) 짝수입니다.");
			break;
		case 1:
			System.out.println(a + " 은(는) 홀수입니다.");
			break;
		default : // 모든 case에 해당하지 않을 경우 무조건 실행시키는 레이블 
			System.out.println(a + " 은(는) 짝수도, 홀수도 아닙니다.");
		}
	}
}
