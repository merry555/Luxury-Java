package �������Ű��2;

public class Sample {
	public String s1 = "���� public~~";
	String s2 = "���� (default)~";
	protected String s3 = "���� protected~";
	private String s4 = "���� private~~";
	
	public void pTest(){
		System.out.println("���� public �޼ҵ�!");
	}
	void dTest(){
		System.out.println("���� ����Ʈ �޼ҵ�!");
	}
	protected void protTest(){
		System.out.println("���� protected �޼ҵ�!");
	}
	private void privTest(){
		System.out.println("���� private �޼ҵ�!");
	}
//	================================================
	public static void main(String[] args) {
		Sample a = new Sample();
		System.out.println(a.s1);
		System.out.println(a.s2);
		System.out.println(a.s3);
		System.out.println(a.s4);
		
		a.pTest();
		a.dTest();
		a.protTest();
		a.privTest();
	}
	

	
	
	
	
	
	
	
	
	
}
