import javax.swing.JOptionPane;

public class _07_while�� {

	public static void main(String[] args) {
		
//		3. while�� : ���ǽ��� true�� ���� ���ӹ����� ��� �ݺ��Ѵ�.
		
		/*
		 *  while(���ǽ�){
		 *  
		 *  	���ӹ���1;
		 *  	���ӹ���2;
		 *  	....
		 *  
		 *  }
		 */
		
//		 1~10�� ����ϰڴ�...
		int n1 = 1;
		while( n1 <= 10 ){
			System.out.println(n1);
			n1++;
		}		
		
		System.out.println("==============================");
		
		aa: while(true){
			String shwMsg = 
					"1. �Է��ϱ� \n"
					+ "2. ����ϱ� \n"
					+ "3. �����ϱ�";
			String ans = JOptionPane.showInputDialog(shwMsg);
			switch(ans){
			case "1":
				JOptionPane.showMessageDialog(null, "�Է��� �����ϼ̽��ϴ�.");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "����� �����ϼ̽��ϴ�");
				break;
			case "3": // ���α׷��� ����
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
				break aa;//return;
			default: // �߸� �Է�
				JOptionPane.showMessageDialog(null, "�߸��Է�");
			}
		}
		
	
	}
}
