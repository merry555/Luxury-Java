import javax.swing.JOptionPane;

public class _04_if_Quiz {

	public static void main(String[] args) {
		
//		�ǽ� : �̸���, ���̸� jop ����ؼ� �Է� �ް�,
//		���̿� �°� �����ϴ� �б��� ����ϼ��� 
//		(��ġ��, �ʵ��б�, ���б�, ����б�)
//		4�� �̻� 7�� ���� : ��ġ��
//		8�� �̻� 13�� ���� : �ʵ��б� ....
		
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���..");
		String strAge = JOptionPane.showInputDialog("���̸� �Է��ϼ���..");
		
		int age = Integer.parseInt(strAge);
		String school;
		if(age >= 4 && age <= 7)
			school = "��ġ��";
		else if(age >= 8 && age <= 13)
			school = "�ʵ��б�";
		else if(age >= 14 && age <= 16)
			school = "���б�";
		else if(age >= 17 && age <= 19)
			school = "����б�";
		else school = "�ش���׾���";
		
		String shwMsg = 
				"�̸� : " + name + "\n"
				+ "���� : " + age + "�� \n"
				+ name + "���� " + school + "�� �����մϴ�.";
		
		JOptionPane.showMessageDialog(null, shwMsg);
				
	}
}
