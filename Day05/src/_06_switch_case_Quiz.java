import javax.swing.JOptionPane;

public class _06_switch_case_Quiz {

	public static void main(String[] args) {
		 
//		실습 : 1~12 숫자를 JOP을 사용해서 입력받도록 유도한 뒤,
//		해당 월은 며칠까지 있는지 출력하세요 .
//			예 : 입력 -> 7 
//				 출력 -> 7월은 31일까지 있습니다. 
		
		String monStr = JOptionPane.showInputDialog("1~12를 입력하세요..");
		int month = Integer.parseInt(monStr);
		String shwMsg;
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			shwMsg = month + "월은 31일까지 있습니다.";
			break;
		case 2:
			shwMsg = month + "월은 28일까지 있습니다.";
			break;
		case 4: case 6: case 9: case 11:
			shwMsg = month + "월은 30일까지 있습니다.";
			break;
		default:
			shwMsg = "해당 월은 존재하지 않습니다.";
		}
		JOptionPane.showMessageDialog(null,shwMsg);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
