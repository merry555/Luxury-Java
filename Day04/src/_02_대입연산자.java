
public class _02_대입연산자 {

	public static void main(String[] args) {
		
//		2. 대입연산자 : = ( 저장하라 )
//		ex) a = 10; a = b;
//		왼쪽은 '공간', 오른쪽은 '값'
		int a, b = 10;
		a = b;
//		a라는 '메모리'에 b의 '값'을 저장하라 
		
//		주의! a = b , b = a 는 완전히 다른 의미다.
		
//		2-2. 복합 대입 연산자 : 연산과 저장을 동시에 수행하는 연산자 
//		주의! 복합대입연산자는 변수의 값을 바꾼다!
		
		
//		+= , -= , *= , /= , %=
//		(1) a += b -> a = a + b => 누적할 때 자주 사용		 
		a = 10;
		b = 20;
		System.out.println(a + b);
		System.out.println("a + b 했을 때의 a : "  + a);
		System.out.println(a += b);
		System.out.println("a += b 했을 때의 a : "  + a);
		
//		(2) a -= b -> a = a - b
				
//		(3) a *= b -> a = a * b
		
//		(4) a /= b -> a = a / b
		
//		(5) a %= b -> a = a % b
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
