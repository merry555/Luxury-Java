
public class _02_��Ÿ��� {

	public static void main(String[] args) {
		// break, continue, return ( goto�� ���� )

		// (1) break
		// - ����� ( �����϶� )
		// - break�� ������ �ִ� ( ������ �� �ִ� ��� ) 3����
		// 1. switch-case
		// 2. while��
		// 3. for��
		// - �ڽŰ� ���� ����� ����� �����Ų��.
		/*
		 * while() {
		 * 
		 * switch() { if () break; // swtich���� ������ } }
		 * 
		 *
		 */
		// (2) continue �� ������ �ִ� 3����
		// - ���ӹ����� �ǳʶٰ� ���� �ܰ踦 �����϶�
		// 1. switch-case
		// 2. while��
		// 3. for��

		for (int i = 10; i >= 0; i--) {
			if (i % 3 == 0) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("==============");

		for (int i = 10; i >= 0; i--) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		return;
//		return : �޼ҵ带 �����϶� + (��ȯ����) ��ȯ�϶� + ���ư��� 
		
//		** �ڹ����α׷��� ���� == ���θ޼ҵ��� ����
//			���α׷� ���� == ���θ޼ҵ��� ����
	}
}













