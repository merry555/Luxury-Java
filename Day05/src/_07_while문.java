import javax.swing.JOptionPane;

public class _07_while문 {

	public static void main(String[] args) {
		
//		3. while문 : 조건식이 true일 동안 종속문장을 계속 반복한다.
		
		/*
		 *  while(조건식){
		 *  
		 *  	종속문장1;
		 *  	종속문장2;
		 *  	....
		 *  
		 *  }
		 */
		
//		 1~10을 출력하겠다...
		int n1 = 1;
		while( n1 <= 10 ){
			System.out.println(n1);
			n1++;
		}		
		
		System.out.println("==============================");
		
		aa: while(true){
			String shwMsg = 
					"1. 입력하기 \n"
					+ "2. 출력하기 \n"
					+ "3. 종료하기";
			String ans = JOptionPane.showInputDialog(shwMsg);
			switch(ans){
			case "1":
				JOptionPane.showMessageDialog(null, "입력을 선택하셨습니다.");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "출력을 선택하셨습니다");
				break;
			case "3": // 프로그램을 종료
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break aa;//return;
			default: // 잘못 입력
				JOptionPane.showMessageDialog(null, "잘못입력");
			}
		}
		
	
	}
}
