package �������Ű��;
import javax.swing.JOptionPane;

// ����� Ŭ����
public class Person {

	String name;
	int age;
	boolean hasPhone;
	
//	�� ����� ������ �������ִ�
//	setName(), setAge(), setHasPhone() ����
//	���ο� Ŭ������ �̵� �޼ҵ� ȣ��
//	setAllMember() : �̸�, ����, �ڵ��������� ��� ������ 
//	�޼ҵ� ����
	
//	this : �� ��ü��
//	��� : �Ű����� �̸��� (�ٸ� ���� �̸���) ��� ������ �̸��� ���� ��
//	��� ���� �տ� this.�� ���ָ� �ȴ�.
	void setName(String name){
		this.name = name;
//		�� ��ü�� name �濡�ٰ� �Ű����� name ���� �����϶�.
	}
	void setAge(int age){
		this.age = age;
	}
	void setHasPhone(boolean hasPhone){
		this.hasPhone = hasPhone;
	}
	void setAllMembers(String name, int age, boolean hasPhone){
		this.name = name;
		this.age = age;
		this.hasPhone = hasPhone;
	}
	
	void showName(){
		System.out.println(this.name);
	}
	
//	������ ������!
//	�츮�� �����ڸ� ���� ������ ������ ���� �ڵ尡 �ڵ����� �߰��ȴ�.
//	(�츮 ���� �������� �ʴ´�)
//	public Person(){
//		
//	}
	public Person(){
		
	}
	public Person(String name){
		this.name = name;
	}
	public Person(int age){
		this.age = age;
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, boolean hasPhone){
		this.name = name;
		this.age = age;
		this.hasPhone = hasPhone;
		System.out.println("������ ���� �Ϸ�!");
	}
}













