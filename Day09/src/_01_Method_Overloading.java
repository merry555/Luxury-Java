
public class _01_Method_Overloading {

//	�����ڷ��� : �ϳ��� �޼ҵ�� ���� �ڷ��� �����͸� ������ �� ����. 
//	�Ű����� : �ϳ��� �޼ҵ�� ������ ���İ� �ٸ� ���ڰ��� ���� �� ����.
//		=> ���������� �޼ҵ� ���� �Ұ� ( ������ �����Ǿ��ֱ� ���� )
//		=> �̸� �����ϱ� ���� �޼ҵ� �����ε��� ����Ѵ�.
	
//	�޼ҵ� �����ε��̶� ? ���� �޼ҵ������ ���� �۾��� �����ϰ� �ϴ� ��
//	�޼ҵ���� ����. ������, �����ڷ����̳� �Ű����� �ڷ���/���� �� ���� 
//	�ϳ� �̻��� �ٸ��� ���ǵǾ�� �Ѵ�.
	public static void main(String[] args) {
		show();
		show(10);
		String ss = show("�ȳ�ȳ�", 3.14);
		System.out.println(ss);
	}
	
	static void show(){
		System.out.println("���� �������� show �޼ҵ�~~");
	}
	
	static void show(int a){
		System.out.println("�����ε��ƴ�! " + a + "�� ���Դ�!");
	}
	
	static String show(String aa, double bb){
		System.out.println(aa + "�� " + bb + "�� ���Դ�!");
		return "ok";
	}
}









