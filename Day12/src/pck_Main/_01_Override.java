package pck_Main;
/*
 * <�������̵� ? �θ� Ŭ������ �޼ҵ带, �ڽ� Ŭ������ �����ϴ� �۾�>
 *  -> �θ� Ŭ���� '�޼ҵ��� ������ �Ȱ���' ���� �ڽ� Ŭ���� �޼ҵ� 
 *  ����) �޼ҵ� ���� : �����ڷ��� �޼ҵ��(�Ű�����1 �ڷ���, �Ű�����2 �ڷ���)
 *  	ex) void show(String)
 *  -> �θ� Ŭ������ �޼ҵ常 �������̵� �� �� �ִ�. 
 *  
 *  -> �θ� �޼ҵ��� �þߴ� �ڽ� �޼ҵ忡�� ���� �� ����
 *  	public > protected > (default) > private 
 *  	public void show() -> private void show() (X)
 *  	private void show() -> public void show() (O)
 */
import pck_Src.*;
public class _01_Override {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student(100,100,100);		
		p.show();
		s.show();	
	}
}
// Ŭ������ ���� ����� �Ұ��� : �޼ҵ�� �浹 ����









