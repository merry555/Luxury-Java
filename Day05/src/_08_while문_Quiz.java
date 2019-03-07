import javax.swing.JOptionPane;

public class _08_while문_Quiz {

	public static void main(String[] args) {
		
//		실습 : 구구단 게임 프로그램
//		메뉴 구성 
//		1. 게임 시작
//		2. 점수 보기
//		3. 종료 하기
		
//		정답 입력 시 +100, 오답 시 -100점
		int jumsu = 0;
		menu: while(true){
			String shwMsg = 
					"1. 게임 시작 \n"
					+ "2. 점수 보기 \n"
					+ "3. 종료 하기";
			
			String ans = JOptionPane.showInputDialog(shwMsg);
					
			switch(ans){
			case "1":
				int n1 = (int)(Math.random()*9)+1;
				int n2 = (int)(Math.random()*9)+1;
				String ans2 = JOptionPane.showInputDialog(n1 + " X " + n2 + " = ?");
				int dab = Integer.parseInt(ans2);
				if(dab == n1 * n2){
					JOptionPane.showMessageDialog(null, "정답!!");
					jumsu+=100;
				}
				else {
					JOptionPane.showMessageDialog(null, "땡!!!!");
					jumsu-=100;
				}
				break;
			case "2":
				JOptionPane.showMessageDialog(null, jumsu);
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다..");
				break menu;
			default :			
				JOptionPane.showMessageDialog(null, "잘못 입력");
			}
				
		}
	}
}
