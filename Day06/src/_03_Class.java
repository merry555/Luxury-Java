// ���θ޼ҵ�� Ŭ����
public class _03_Class {

//	1. Ŭ���� ( ���赵 )
//	2. ��ü ( == �ν��Ͻ� )
//	3. ���۷���
	
	public static void main(String[] args) {
		
//		��ü ���� Ű���� : new 
		Person p1 = new Person();
//		Person ����� ��ü�� �����϶�
//		Ŭ������() => �ش� Ŭ������ ������
//		���� : new Person;
		System.out.println(new Person());
		
		new Person();
//		��ü�� ����������, �� ��ü�� ������ȣ�� �������� ������
//		Garbage Collector�� �� ��ü�� �����Ѵ�. 
		
//		��ü�� ����Ʈ�� ( �⺻���� ����Ǿ��ִ� �� )
		System.out.println(p1.age);	// ���ڴ� 0
		System.out.println(p1.name);// ���ڿ��� null
		System.out.println(p1.hasPhone);// boolean�� false
		
		
		p1.name = "�Ѹ�";
		p1.age = 10;
		p1.hasPhone = true;
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.hasPhone);
	}
	
	
	
}









