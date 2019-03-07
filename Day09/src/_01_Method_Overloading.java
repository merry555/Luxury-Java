
public class _01_Method_Overloading {

//	리턴자료형 : 하나의 메소드는 여러 자료형 데이터를 리턴할 수 없다. 
//	매개변수 : 하나의 메소드는 정해진 형식과 다른 인자값을 넣을 수 없다.
//		=> 유동적으로 메소드 실행 불가 ( 형식이 지정되어있기 때문 )
//		=> 이를 개선하기 위해 메소드 오버로딩을 사용한다.
	
//	메소드 오버로딩이란 ? 같은 메소드명으로 여러 작업을 가능하게 하는 것
//	메소드명은 같다. 하지만, 리턴자료형이나 매개변수 자료형/개수 중 뭐라도 
//	하나 이상은 다르게 정의되어야 한다.
	public static void main(String[] args) {
		show();
		show(10);
		String ss = show("안녕안녕", 3.14);
		System.out.println(ss);
	}
	
	static void show(){
		System.out.println("나는 오리지널 show 메소드~~");
	}
	
	static void show(int a){
		System.out.println("오버로딩됐다! " + a + "가 들어왔다!");
	}
	
	static String show(String aa, double bb){
		System.out.println(aa + "와 " + bb + "가 들어왔다!");
		return "ok";
	}
}









