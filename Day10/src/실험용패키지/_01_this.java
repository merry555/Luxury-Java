package 실험용패키지;
// 메인용 클래스
public class _01_this {

	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		Person c = new Person();
		
//		
		a.setName("둘리");
		System.out.println(a.name);
		b.setAge(10);
		System.out.println(b.age);
		c.setAllMembers("또치", 20, true);
	}
}
