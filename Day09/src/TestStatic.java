// 설계용 
public class TestStatic {

	String insMsg = "일반 인스턴스 메세지";
	static String stMsg = "스태틱 메시지";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void insPrint(){
		System.out.println(insMsg + " 를 출력합니다~~~");
		System.out.println(stMsg + " 도 출력합니다~~~ ");
	}
	
//	static void insPrint(){
//		System.out.println(insMsg + " 를 출력합니다~~~");
//		System.out.println(stMsg + " 도 출력합니다~~~ ");
//	}
	
//	static 메소드는 일반 멤버변수를 사용할 수 없다.
//	static 멤버의 생성 시점 : 실행하자마자 가장 먼저 
//	일반 멤버 생성 시점 : 프로그램 실행 중, 객체 생성 명령을 만날 때 
//	생성 시점이 static이 앞서 있기 때문에 ..
	
}













