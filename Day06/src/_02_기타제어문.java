
public class _02_기타제어문 {

	public static void main(String[] args) {
		// break, continue, return ( goto는 없다 )

		// (1) break
		// - 멈춰라 ( 종료하라 )
		// - break가 영향을 주는 ( 종료할 수 있는 제어문 ) 3가지
		// 1. switch-case
		// 2. while문
		// 3. for문
		// - 자신과 가장 가까운 제어문을 종료시킨다.
		/*
		 * while() {
		 * 
		 * switch() { if () break; // swtich문을 종료함 } }
		 * 
		 *
		 */
		// (2) continue 가 영향을 주는 3가지
		// - 종속문장을 건너뛰고 다음 단계를 실행하라
		// 1. switch-case
		// 2. while문
		// 3. for문

		for (int i = 10; i >= 0; i--) {
			if (i % 3 == 0) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("==============");

		for (int i = 10; i >= 0; i--) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		return;
//		return : 메소드를 종료하라 + (반환값을) 반환하라 + 돌아가라 
		
//		** 자바프로그램의 시작 == 메인메소드의 시작
//			프로그램 종료 == 메인메소드의 종료
	}
}













