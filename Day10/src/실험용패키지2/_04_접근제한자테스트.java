package 실험용패키지2;

public class _04_접근제한자테스트 {

	public static void main(String[] args) {
		Sample a = new Sample();
		System.out.println(a.s1);
		System.out.println(a.s2);
		System.out.println(a.s3);
//		System.out.println(a.s4);
		
		a.pTest();
		a.dTest();
		a.protTest();
//		a.privTest();
//		결론 : 같은 패키지의 다른 클래스들은 private만 접근 불가
	}
}
