
public class _03_증감연산자 {

	public static void main(String[] args) {
		
//		3. 증감 연산자 : ++ , --
//		예 : a++ 또는 ++a 
//			-> a에 +1 한 후 다시 a에 저장 
//			-> a = a + 1;
//		예 : a-- 또는 --a 
//		-> a에 -1 한 후 다시 a에 저장 
//		-> a = a - 1;
		
//		증감 연산자의 주용도 : 개수 셀 때 주로 사용
		
		int a = 10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		a--;
		System.out.println(a);
		--a; 
		System.out.println(a);
		
		a = 10;
		int b;
		
		b = ++a;
		System.out.println(b);
		
//		(1)	전치연산 ( 전위연산 ) 
//			- 자신을 먼저 증감시킨 뒤, 나머지 연산을 수행
//		(2) 후치연산 ( 후위연산 )
//			- 나머지 연산을 먼저 수행한 후, 마지막에 자신을 +1 증감함
		
		a = 10;
		b = a++;
		System.out.println(b);
		System.out.println(a);
		
		int c = 100;
		System.out.println("현재 C의 값 : " + c++ );  // 100
		System.out.println("현재 C의 값 : " + ++c );	 // 102
			
	}
}
