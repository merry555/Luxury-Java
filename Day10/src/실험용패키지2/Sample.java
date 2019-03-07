package 실험용패키지2;

public class Sample {
	public String s1 = "나는 public~~";
	String s2 = "나는 (default)~";
	protected String s3 = "나는 protected~";
	private String s4 = "나는 private~~";
	
	public void pTest(){
		System.out.println("나는 public 메소드!");
	}
	void dTest(){
		System.out.println("나는 디폴트 메소드!");
	}
	protected void protTest(){
		System.out.println("나는 protected 메소드!");
	}
	private void privTest(){
		System.out.println("나는 private 메소드!");
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
