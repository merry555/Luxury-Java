package �������Ű��;

import �������Ű��2.Sample;

/*
 * < ���� ������ : �ٸ� Ŭ�����鿡�� ����Ǵ� ������ �����ϴ� Ű���� >
 * -> �̸� ���� Ŭ������ ����ȭ�� �� �ִ�.
 * 	����ȭ ? ������ �͸� �ּ������� �����ֵ�, �� �� ������ ���ʿ���
 *	������ �����. 
 * -> visibility : �þ� ( ����Ǵ� ���� )
 * -> ���������ڴ� �� 4������ �ִ�. 
 * 		1) public : ������
 * 			-�ٸ� ��� Ŭ�������� ���� ����
 * 		2) protected : ��ȣ�Ǵ�
 * 			-���� ��Ű�� : O 
 * 			-�ٸ� ��Ű�� : X ( ��� ������ O )
 * 		3)          : (default)
 * 			-���� ��Ű�� : O
 * 			-�ٸ� ��Ű�� : X
 * 		4) private : ������
 * 			- �ڱ� Ŭ������ ������ ��� Ŭ������ ���� �Ұ���
 */
public class _03_���������� {

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
//	��� : �ܺ� ��Ű���� Ŭ�������� public�� ���� ���� 
}










