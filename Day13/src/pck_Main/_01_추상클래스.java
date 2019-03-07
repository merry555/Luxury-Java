package pck_Main;

import pck_Src.Tank;
import pck_Src.Unit;

/*
 * < abstract : 추상적인 >
 *  - 상속관계에서 부모클래스보다 자식클래스가 더 중요하다.
 *  - 어차피 부모클래스의 메소드는 자식클래스가 오버라이드해서 
 *    사용하는 경우가 많다.
 *    => 부모클래스의 내용물은 그다지 중요하지 않을 때가 있다!
 *    => 내용물은 자식클래스에게 맡기고, 기준만 제시하고 싶을때
 *       부모 클래스를 추상클래스로 만들면 된다.
 */
public class _01_추상클래스 {

	public static void main(String[] args) {
		
		Unit t = new Tank();
		t.name = "탱크";
		t.go(10);
		
//		익명 클래스 ( 1회용 클래스 )
		Unit u = new Unit(){
			@Override
			public int attack(Unit a) {
				// TODO Auto-generated method stub
				System.out.println(a.name + "공격! 피해력: 200");
				return 200;
			}
		};
		u.name = "저글링";
		
		u.hp -= t.attack(u);
		t.hp -= u.attack(t);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
