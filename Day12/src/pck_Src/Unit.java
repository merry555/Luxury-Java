package pck_Src;

public class Unit {

	public String name;
	public int hp; // 체력
	public boolean attackable; // 공격 유닛인가 아닌가
	
	public void go(){
		System.out.println("유닛 이동~");
	}
	public void attack(){
		System.out.println("유닛 공격!");
	}
	
}
