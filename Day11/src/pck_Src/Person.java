package pck_Src;

public class Person {

	public String name;
	public String phone;
	
	public String getName(){
		return this.name;
	}
//	Person의 생성자는 name과 phone을 넣어줘야한다.
	public Person(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
}
