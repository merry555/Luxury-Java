import javax.swing.JOptionPane;

// ���赵�� Ŭ����
public class Student {
	// <����� Ŭ����> : �̸�, ��,��,�� ����, ���, ����
	// �޼ҵ� : 
	// - �̸� �Է� �޼ҵ� 
	// - ��, ��, �� �Է� �ް�, ���, ���� ���ϴ� �޼ҵ�
	// - ���� �����ִ� �޼ҵ� 
	String name;
	int kr, en, ma;
	char grade;
	double avg;
	
	void setName(){
		name = JOptionPane.showInputDialog("�̸�");
	}
	void setData(){
		String k = JOptionPane.showInputDialog("����");
		String e = JOptionPane.showInputDialog("����");
		String m = JOptionPane.showInputDialog("����");
		kr = Integer.parseInt(k);
		en = Integer.parseInt(e);
		ma = Integer.parseInt(m);
		
		avg = (kr+en+ma)/3.0;
		
		if(avg>=90) grade = 'A';
		else if(avg>= 80) grade = 'B';
		else if(avg>= 70) grade = 'C';
		else if(avg>= 60) grade = 'D';
		else grade = 'F';
	}
	
	void showFields(){
		String shw = "";
		shw += "�̸� : " + name + "\n"
				+ "��� : " + avg + "\n"
				+ "���� : " + grade + "\n";
		JOptionPane.showMessageDialog(null,shw);
	}
}













