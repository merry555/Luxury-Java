import javax.swing.JOptionPane;

// 메인용 클래스
public class _02_객체의배열 {

	public static void main(String[] args) {
		// Person 객체의 배열 
		
		// 배열 선언 - 메모장 만듦
 		Person[] p;
 		
 		p = new Person[4];
// 		Person 4개짜리 배열 생성
 		System.out.println(p);
 		System.out.println(p[0]);	// null
 		System.out.println(p[1]);   // null
 		
// 		에러 :
// 		p[0].age = 10;
// 		System.out.println(p[0].age);
 		
// 		주의 ! 클래스 배열 생성은 집문서(레퍼런스) 배열이 생성되는 것
// 		실제 집이 지어지는 것이 아니다. 
 		
// 		반드시 객체 생성 작업이 있어야 한다.
 		p[0] = new Person();
 		p[1] = new Person();
 		p[2] = new Person();
 		p[3] = new Person();
 		
 		p[0].age = 10;
		System.out.println(p[0].age);
 		
//		실습 : jop, for문 사용
//		이름, 나이, 핸드폰유무를 입력 받고, 모든 객체에 저장
//		출력 : 핸드폰이 있습니까? (Y/N) 
//		입력 : Y -> hasPhone = true
//			   N -> hasPhone = false 
//		for(int i = 0; i<p.length ; i++){
//			p[i].name = JOptionPane.showInputDialog(i + 1 + "번 째 이름");
//			String age = JOptionPane.showInputDialog("나이");
//			p[i].age = Integer.parseInt(age);
//			String hasPhone = JOptionPane.showInputDialog("핸드폰 (Y/N)");
//			if(hasPhone.equals("Y")){
//				p[i].hasPhone = true;
//			} else {
//				p[i].hasPhone = false;
//			}
//		}
//		
//		String shwMsg = "";	// 초기화 
//		for(int i = 0; i<p.length; i++)
//		{
//			shwMsg += i+1 + "번\n" 
//					+ "이름 : " + p[i].name + "\n"
//					+ "나이 : " + p[i].age + "\n"
//					+ "핸드폰 유무 : " + p[i].hasPhone + "\n"
//					+ "============== \n";
//		}
//		JOptionPane.showMessageDialog(null, shwMsg);
		
//		String a = null;
//		a += "ABC";
//		System.out.println(a);
//		String b = "";
//		b += "ABC";
//		System.out.println(b);
		
		int i = 1;
		for(Person s : p){
			s.name = JOptionPane.showInputDialog(i++ + "번 째 이름");
			String age = JOptionPane.showInputDialog("나이");
			s.age = Integer.parseInt(age);
			String hasPhone = JOptionPane.showInputDialog("핸드폰 (Y/N)");
			if(hasPhone.equals("Y")){
				s.hasPhone = true;
			} else {
				s.hasPhone = false;
			}
		}
		
		String shwMsg = "";	// 초기화 
		for(Person s : p)
		{
			shwMsg += i+1 + "번\n" 
					+ "이름 : " + s.name + "\n"
					+ "나이 : " + s.age + "\n"
					+ "핸드폰 유무 : " + s.hasPhone + "\n"
					+ "============== \n";
		}
		JOptionPane.showMessageDialog(null, shwMsg);
	}
}
/*
 * 확장 for문 
 * 	- 읽기 전용
 * 	- 배열의 값은 바꿔줄 수 없다
 * 	- 객체의 배열이라면, 배열의 값을 참조하여 멤버변수(방) 값은 바꿔줄 수 있다.
 */
























