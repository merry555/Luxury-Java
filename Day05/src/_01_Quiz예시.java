import javax.swing.JOptionPane;

public class _01_Quiz���� {

	public static void main(String[] args) {
		
		// ������ ����
// 		jop�� ����Ͽ� ������ ����� �� , ���� �Է¹޾Ƽ�
//		�������� �ƴ��� ����ϼ���
		
		// 1~9 : 
		int a = (int)(Math.random()*9)+1;
		int b = (int)(Math.random()*9)+1;
		String msg = a + " x " + b + " = ?";
		String ans = JOptionPane.showInputDialog(msg);
		
		int ansInt = Integer.parseInt(ans);
		
		msg = (ansInt == a*b)? "����!!!!" :"��!!!!" ;
		JOptionPane.showMessageDialog(null, msg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
