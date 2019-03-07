package pck_Src;

public class Tank extends Unit{

//	@ 주석 : annotation => 컴퓨터에게 전달하는 주석
//	@Override : 오버라이드하는 메소드다!
	
	@Override
	public int attack(Unit a) {
		// TODO Auto-generated method stub
		System.out.println(a.name+"을 공격했다!");
		return 100;
	}
	public void go(int a){
		System.out.println("탱크, " + a +"만큼 이동했습니다.. " );
	}
	
	
	
	
	
	
	
	
}
