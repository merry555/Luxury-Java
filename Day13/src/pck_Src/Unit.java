package pck_Src;
// 추상클래스 만들기
// 추상 메소드는 추상 클래스에만 들어갈 수 있다. 
public abstract class Unit {

	public String name;
	public int hp;
	public boolean alive = true;
	
//	public abstract void go(int a);
	public void go(int a){
		
	}
	
	public abstract int attack(Unit a);
	// 인자로 들어온 객체를 공격하여 int형으로 공격 게이지를 반환하라
	
	
	
	
	
	
	
	
	
	
	
}
