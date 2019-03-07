package 실험용패키지;
import 실험용패키지2.Person2;
public class _04_Getter_Setter {

	public static void main(String[] args) {
		
		Person2 a = new Person2();
//		에러 : a.name = "둘리";
		a.setName("둘리");
		System.out.println(a.getName());
	}
}
