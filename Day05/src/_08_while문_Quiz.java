import javax.swing.JOptionPane;

public class _08_while��_Quiz {

	public static void main(String[] args) {
		
//		�ǽ� : ������ ���� ���α׷�
//		�޴� ���� 
//		1. ���� ����
//		2. ���� ����
//		3. ���� �ϱ�
		
//		���� �Է� �� +100, ���� �� -100��
		int jumsu = 0;
		menu: while(true){
			String shwMsg = 
					"1. ���� ���� \n"
					+ "2. ���� ���� \n"
					+ "3. ���� �ϱ�";
			
			String ans = JOptionPane.showInputDialog(shwMsg);
					
			switch(ans){
			case "1":
				int n1 = (int)(Math.random()*9)+1;
				int n2 = (int)(Math.random()*9)+1;
				String ans2 = JOptionPane.showInputDialog(n1 + " X " + n2 + " = ?");
				int dab = Integer.parseInt(ans2);
				if(dab == n1 * n2){
					JOptionPane.showMessageDialog(null, "����!!");
					jumsu+=100;
				}
				else {
					JOptionPane.showMessageDialog(null, "��!!!!");
					jumsu-=100;
				}
				break;
			case "2":
				JOptionPane.showMessageDialog(null, jumsu);
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�..");
				break menu;
			default :			
				JOptionPane.showMessageDialog(null, "�߸� �Է�");
			}
				
		}
	}
}
