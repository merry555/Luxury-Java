
public class _06_Static멤버변수 {

	public static void main(String[] args) {
		TestStatic t1 = new TestStatic();
		TestStatic t2 = new TestStatic();
		
		t1.insMsg ="일반 변수가 바뀌었지롱~~";
		System.out.println("t1 : " + t1.insMsg); // 물론 바뀜
		System.out.println("t2 : " + t2.insMsg); // 당연히 안바뀜
		
		t1.stMsg = "스태틱 변수가 바뀌었지롱~~";
		System.out.println("t1 : " + t1.stMsg); // 당연히 바뀜
		System.out.println("t2 : " + t2.stMsg); // ???????
		
		TestStatic t3 = new TestStatic();
		System.out.println("t3 : " + t3.stMsg); //방금 만든건데도 바뀌어있음
		
//		결론 : static을 붙이면 같은 메모리를 공용으로 사용하기 때문에 
//			 다른 객체를 통해서 값을 바꾸면 모든 객체의 static 멤버도 바뀌는
//			 효과를 볼 수 있다. 
//		용도 : 팀 플레이 게임을 만든다 
//		-> 플레이어 객체들 상태를 모두 lose로 바꿔야 한다
//		-> static boolean win; 으로 멤버변수를 static으로 지정한 뒤,  
//		-> win = false 한 번만 코드를 쓰면 된다.
		
		
		
		
		
		
		
		
		
		
	}
}
