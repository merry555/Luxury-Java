import javax.swing.JOptionPane;

public class _04_�޼ҵ�ǽ� {

//	�ǽ� 1: ������ ���ڰ����� �ް�, �ش� ���� ��ŭ '*'�� sysout �޼ҵ� ����
//	5 -> *****
//	3 -> ***
	static void print(int a){
		for(int i=1; i <= a; i++){
			System.out.print("*");
		}
		System.out.println();
	}
	
//	�ǽ� 2: �̸��� jop�� ���� �Է� �ް�, �̸� �������ִ� �޼ҵ� ����
	static String setName(){
		return JOptionPane.showInputDialog("�̸�");
	}
//	�ǽ� 3: ���̸� jop�� ���� �Է� �ް�, �̸� �������ִ� �޼ҵ� ����
	static int setAge(){
//		String age = JOptionPane.showInputDialog("����");
//		return Integer.parseInt(age);
		return Integer.parseInt(JOptionPane.showInputDialog("����"));
	}
	
	public static void main(String[] args) {
//		�ǽ�1���� ������ �Լ� ȣ�� 
		print(7);
//		�ǽ�2���� ������ �Լ��� ȣ���ϰ�, �̸� name ������ ���� && ���
		String name = setName();
		System.out.println(name);
//		�ǽ�3���� ������ �Լ��� ȣ���ϰ�, �̸� age ������ ���� && ���
		int age = setAge();
//		�̸�,���̸� ������ Ŭ���� ���� -> ��ü ���� ��
//		�ǽ� 2, 3���� �޼ҵ带 ���� �� ��ü�� �̸�, ���� ����
	}
}








