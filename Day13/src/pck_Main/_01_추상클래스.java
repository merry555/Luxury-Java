package pck_Main;

import pck_Src.Tank;
import pck_Src.Unit;

/*
 * < abstract : �߻����� >
 *  - ��Ӱ��迡�� �θ�Ŭ�������� �ڽ�Ŭ������ �� �߿��ϴ�.
 *  - ������ �θ�Ŭ������ �޼ҵ�� �ڽ�Ŭ������ �������̵��ؼ� 
 *    ����ϴ� ��찡 ����.
 *    => �θ�Ŭ������ ���빰�� �״��� �߿����� ���� ���� �ִ�!
 *    => ���빰�� �ڽ�Ŭ�������� �ñ��, ���ظ� �����ϰ� ������
 *       �θ� Ŭ������ �߻�Ŭ������ ����� �ȴ�.
 */
public class _01_�߻�Ŭ���� {

	public static void main(String[] args) {
		
		Unit t = new Tank();
		t.name = "��ũ";
		t.go(10);
		
//		�͸� Ŭ���� ( 1ȸ�� Ŭ���� )
		Unit u = new Unit(){
			@Override
			public int attack(Unit a) {
				// TODO Auto-generated method stub
				System.out.println(a.name + "����! ���ط�: 200");
				return 200;
			}
		};
		u.name = "���۸�";
		
		u.hp -= t.attack(u);
		t.hp -= u.attack(t);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
