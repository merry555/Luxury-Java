import javax.swing.JOptionPane;

public class _04_메소드실습 {

//	실습 1: 정수를 인자값으로 받고, 해당 정수 만큼 '*'을 sysout 메소드 정의
//	5 -> *****
//	3 -> ***
	static void print(int a){
		for(int i=1; i <= a; i++){
			System.out.print("*");
		}
		System.out.println();
	}
	
//	실습 2: 이름을 jop을 통해 입력 받고, 이를 리턴해주는 메소드 정의
	static String setName(){
		return JOptionPane.showInputDialog("이름");
	}
//	실습 3: 나이를 jop을 통해 입력 받고, 이를 리턴해주는 메소드 정의
	static int setAge(){
//		String age = JOptionPane.showInputDialog("나이");
//		return Integer.parseInt(age);
		return Integer.parseInt(JOptionPane.showInputDialog("나이"));
	}
	
	public static void main(String[] args) {
//		실습1에서 정의한 함수 호출 
		print(7);
//		실습2에서 정의한 함수를 호출하고, 이를 name 변수에 저장 && 출력
		String name = setName();
		System.out.println(name);
//		실습3에서 정의한 함수를 호출하고, 이를 age 변수에 저장 && 출력
		int age = setAge();
//		이름,나이를 저장할 클래스 정의 -> 객체 생성 후
//		실습 2, 3번의 메소드를 통해 각 객체에 이름, 나이 저장
	}
}








