
public class _05_switch_case�� {

	public static void main(String[] args) {
//		2. switch-case : 
//		���� ���� �´� case ���̺��� ã�ư��� �����Ű�� Ű����
//		���� if������ ��ü�� �����ϴ�. 
		
//		������ ! case ���� �Ǽ��� ������ �� ����. 
//		case 3.14: (X)
//		case 1.0: (X) 
//		case "ABC": (O) �ڹٿ����� ���ڿ� ���̺� ���� 
		
		int a = (int)(Math.random()*1000)+1; // 1 ~ 1000���� ����
		switch(a%2){
		case 0 : 	// ���� : �� �ִٸ�, �̴� ���̺��̶�� �Ѵ�. 
					// ���̺��� å���� ������ �Ѵ�. 
			System.out.println(a + " ��(��) ¦���Դϴ�.");
			break;
		case 1:
			System.out.println(a + " ��(��) Ȧ���Դϴ�.");
			break;
		default : // ��� case�� �ش����� ���� ��� ������ �����Ű�� ���̺� 
			System.out.println(a + " ��(��) ¦����, Ȧ���� �ƴմϴ�.");
		}
	}
}
