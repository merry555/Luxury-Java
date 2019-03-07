package 실험용패키지;

import 실험용패키지2.Sample;

/*
 * < 접근 제한자 : 다른 클래스들에게 노출되는 범위를 지정하는 키워드 >
 * -> 이를 통해 클래스를 은닉화할 수 있다.
 * 	은닉화 ? 보여줄 것만 최소한으로 보여주되, 그 외 노출이 불필요한
 *	정보는 감춘다. 
 * -> visibility : 시야 ( 노출되는 범위 )
 * -> 접근제한자는 총 4가지가 있다. 
 * 		1) public : 공공의
 * 			-다른 모든 클래스에서 접근 가능
 * 		2) protected : 보호되는
 * 			-같은 패키지 : O 
 * 			-다른 패키지 : X ( 상속 관계라면 O )
 * 		3)          : (default)
 * 			-같은 패키지 : O
 * 			-다른 패키지 : X
 * 		4) private : 사적인
 * 			- 자기 클래스를 제외한 모든 클래스는 접근 불가능
 */
public class _03_접근제한자 {

	public static void main(String[] args) {
		Sample a = new Sample();
		System.out.println(a.s1);
//		System.out.println(a.s2);
//		System.out.println(a.s3);
//		System.out.println(a.s4);
		
		a.pTest();
//		a.dTest();
//		a.protTest();
//		a.privTest();
	}
//	결론 : 외부 패키지의 클래스들은 public만 접근 가능 
}










