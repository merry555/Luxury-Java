package pck_Src;

public class Person {
	public String name;
	public int age;
	public boolean hasPhone;
	
	public Person(){}
	public Person(String name, int age, boolean hasPhone){
		this.name = name;
		this.age = age;
		this.hasPhone = hasPhone;
	}
	
	public void show(){
		System.out.println("나는 Person(부모) 소속의 메소드~~");
	}
	
	
	
	
	
	
	
	
}
