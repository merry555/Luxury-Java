import javax.swing.JOptionPane;

public class _09_JOptionPane {

//	JOptionPane �̶�? â ����� �Է¹ްų�, �޼����� �����ִ� �뵵
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "��������");
		// ���ڿ��� â���� ���
//		jop -> �ڵ��ϼ� -> . -> showm -> �ڵ��ϼ�
		String s = JOptionPane.showInputDialog("�ƹ��ų�");
		// ���ڿ��� â���� �Է�
//		jop -> �ڵ��ϼ� -> . -> showIn -> �ڵ��ϼ�	
		
		System.out.println(s);
		JOptionPane.showMessageDialog(null, s);
		
//		"5" -> 5 
		
		int i = Integer.parseInt(s);
		double d = Double.parseDouble(s);
		System.out.println(s + 23);
		System.out.println(i + 23);
		System.out.println(d);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
