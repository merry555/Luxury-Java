import javax.swing.JOptionPane;

class Student{	// ����� Ŭ����
	String name;
	int kr, en, ma, tot;
	double avg;
	char grade;
}


public class _04_Class�ǽ� {	// ���ο� Ŭ����
	
	public static void main(String[] args) {
		String shwMsg = 
				"1. �л� ���� �Է� \n" 
				+ "2. �л� ���� ��� \n"
				+ "3. �հ� ��� ���� \n"
				+ "4. ���α׷� ���� ";
		// ���� ������ ��ü 1�� ���� 
		Student s1 = new Student();
		menu: while(true){
			String ans = JOptionPane.showInputDialog(shwMsg);
			switch(ans){
			case "1":
				s1.name = JOptionPane.showInputDialog("�̸� �Է�");
				String kr = JOptionPane.showInputDialog("���� �Է�");
				s1.kr = Integer.parseInt(kr);
				String en = JOptionPane.showInputDialog("���� �Է�");
				s1.en = Integer.parseInt(en);
				String ma = JOptionPane.showInputDialog("���� �Է�");
				s1.ma = Integer.parseInt(ma);
				s1.tot = s1.kr + s1.en + s1.ma;
				s1.avg = (double)s1.tot / 3;
				if(s1.avg >= 90) s1.grade = 'A';
				else if(s1.avg >= 80) s1.grade = 'B';
				else if(s1.avg >= 70) s1.grade = 'C';
				else if(s1.avg >= 60) s1.grade = 'D';
				else s1.grade = 'F';
				JOptionPane.showMessageDialog(null, "���� �Ϸ�!");
				break;
			case "2":
				String info = 
					"�̸� : " + s1.name + "\n"
					+ "��� : " + s1.avg + "\n"
					+ "��� : " + s1.grade;
				JOptionPane.showMessageDialog(null, info);
				break;
			case "3":
				if(s1.avg >= 85.5){
					JOptionPane.showMessageDialog(null, "�հ�");
				} else {
					JOptionPane.showMessageDialog(null, "���հ�");
				}
				break;
			case "4":
				JOptionPane.showMessageDialog(null,"���α׷��� �����մϴ�.");
				break menu;
			default: 
				JOptionPane.showMessageDialog(null, "�߸� �Է�!");
			}
		}
		
	}

	
}










