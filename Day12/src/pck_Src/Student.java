package pck_Src;

public class Student extends Person{

	int kr, en, ma;
	
	public Student(int kr, int en, int ma){
		super();
		this.kr = kr;
		this.en = en;
		this.ma = ma;
	}
	
	public void show(){
		System.out.println("나는 Student가 오버라이드한 show 메소드!");
	}
}










