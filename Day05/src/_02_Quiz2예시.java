
public class _02_Quiz2예시 {

	public static void main(String[] args) {
//		문제 : 다음의 각 단계별로 결과를 출력하세요

//		1. 1~200까지의 랜덤 정수 값 결과를 변수에 저장한 후 출력1
		int n1 = (int)(Math.random()*200 )+1;
		System.out.println(n1);
		
//		2. 1번에서 만든 변수의 값에 10을 나눈 몫을 출력
		System.out.println("n1 / 10 => " + n1 / 10);
//
//		3. 1번에서 만든 변수의 값을 10으로 나누었을 때의 나머지 값을 출력
		System.out.println("n1 % 10 => " + n1 % 10);

//		4. 1번에서 만든 변수의 값이 10으로 나누어 떨어지는지 true 혹은 false 로 출력
		boolean b1 = n1%10==0 ;
		System.out.println(b1);
		
//		​5. 1번에서 만든 변수의 값에 40을 더한 후 다시 그 변수에 저장하고, 이를 출력
		n1 += 40;
		System.out.println(n1);
//		​6. 1번에서 만든 변수의 값이 80 이상 150 미만인지를 출력
		boolean b2 = (n1 >= 80 && n1 < 150);
//		주의! 80 <= n1 < 150 (X)
		System.out.println(b2);

		String a = "ABC";
//		주의 ! a == "ABC"; (X)
//		문자열이 서로 같은지 다른지 비교할 때는 == 쓰면 안됨!
//		.equals() 라는 기능(메소드)를 사용해야 함.
		System.out.println(a.equals("ABC")); // true/false 를 반환
		System.out.println(a.equals("ABCD")); // true/false 를 반환
		
	}
}
