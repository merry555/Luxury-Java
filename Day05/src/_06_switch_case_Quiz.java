import javax.swing.JOptionPane;

public class _06_switch_case_Quiz {

	public static void main(String[] args) {
		 
//		�ǽ� : 1~12 ���ڸ� JOP�� ����ؼ� �Է¹޵��� ������ ��,
//		�ش� ���� ��ĥ���� �ִ��� ����ϼ��� .
//			�� : �Է� -> 7 
//				 ��� -> 7���� 31�ϱ��� �ֽ��ϴ�. 
		
		String monStr = JOptionPane.showInputDialog("1~12�� �Է��ϼ���..");
		int month = Integer.parseInt(monStr);
		String shwMsg;
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			shwMsg = month + "���� 31�ϱ��� �ֽ��ϴ�.";
			break;
		case 2:
			shwMsg = month + "���� 28�ϱ��� �ֽ��ϴ�.";
			break;
		case 4: case 6: case 9: case 11:
			shwMsg = month + "���� 30�ϱ��� �ֽ��ϴ�.";
			break;
		default:
			shwMsg = "�ش� ���� �������� �ʽ��ϴ�.";
		}
		JOptionPane.showMessageDialog(null,shwMsg);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
