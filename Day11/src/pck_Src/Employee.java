package pck_Src;

public class Employee extends Person{
// super : �θ�Ŭ������ ��Ī
// super() : �θ�Ŭ������ ������ ����
	public String name;
	public int salary;
	public String position;
	public Employee(){
		super("�θ�", "010-1234-4578");
		name = "�ڽ�";
	}
	
//  ��ӹ��� Ŭ������ ������ �⺻ ���
//	public Employee(){
//		super();
//	}
	
//	�ڽ�Ŭ������ ��ü�� ������ ��, �θ� Ŭ������ ���� �����Ǳ� ������
//	�ڽ� Ŭ���� ������ ���ο� �θ� Ŭ���� �����ڿ� �´� ������ �߰��ؾ� �Ѵ�.
	
//	����, �θ�Ŭ������ ���� �̸��� ����� �����ϸ�,
//	super�� this�� ���� �����ϸ� �ȴ�. 
	public void showName(){
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
