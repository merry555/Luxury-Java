// 메인메소드용 클래스
public class _03_Class {

//	1. 클래스 ( 설계도 )
//	2. 객체 ( == 인스턴스 )
//	3. 레퍼런스
	
	public static void main(String[] args) {
		
//		객체 생성 키워드 : new 
		Person p1 = new Person();
//		Person 모양의 객체를 생성하라
//		클래스명() => 해당 클래스의 생성자
//		에러 : new Person;
		System.out.println(new Person());
		
		new Person();
//		객체는 생성했지만, 그 객체의 고유번호를 저장하지 않으면
//		Garbage Collector가 그 객체를 해제한다. 
		
//		객체의 디폴트값 ( 기본으로 저장되어있는 값 )
		System.out.println(p1.age);	// 숫자는 0
		System.out.println(p1.name);// 문자열은 null
		System.out.println(p1.hasPhone);// boolean은 false
		
		
		p1.name = "둘리";
		p1.age = 10;
		p1.hasPhone = true;
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.hasPhone);
	}
	
	
	
}









