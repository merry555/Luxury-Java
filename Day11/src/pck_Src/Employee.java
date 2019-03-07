package pck_Src;

public class Employee extends Person{
// super : 부모클래스를 지칭
// super() : 부모클래스의 생성자 실행
	public String name;
	public int salary;
	public String position;
	public Employee(){
		super("부모", "010-1234-4578");
		name = "자식";
	}
	
//  상속받은 클래스의 생성자 기본 모양
//	public Employee(){
//		super();
//	}
	
//	자식클래스가 객체로 생성될 때, 부모 클래스가 먼저 생성되기 때문에
//	자식 클래스 생성자 내부에 부모 클래스 생성자에 맞는 문장을 추가해야 한다.
	
//	만약, 부모클래스와 같은 이름의 멤버가 존재하면,
//	super와 this를 통해 구별하면 된다. 
	public void showName(){
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
