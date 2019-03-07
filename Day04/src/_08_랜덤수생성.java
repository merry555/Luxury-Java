
public class _08_랜덤수생성 {

	public static void main(String[] args) {
		
//		< 랜덤 수 생성 (난수 생성) >
//		Math.random() : 0.0 ~ 0.999999999 까지의 실수가 랜덤하게 나온다.
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		
//		0~9까지 수를 랜덤하게 출력하고 싶어 ...
		System.out.println( (int)(Math.random()*10) );
		
//		1~10까지 수를 랜덤하게 출력하고 싶어 ...
		System.out.println( (int)(Math.random()*10) + 1 );
		
//		1~6 까지 수를 랜덤하게 출력하고 싶어 ...
		System.out.println( (int)(Math.random()*6) + 1 );
		
//		실습 : 2~9단 구구단을 랜덤하게 출력
		int a, b;
		a = (int)(Math.random()*8)+2; // 2 ~ 9 중 랜덤 
		b = (int)(Math.random()*8)+2; // 2 ~ 9 중 랜덤 
		
//		출력 예 :  5 x 4 = 20 등으로 랜덤하게 나오면 됨.
		System.out.println( a + " x " + b + " = " + a*b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
