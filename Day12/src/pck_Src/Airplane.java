package pck_Src;

public class Airplane extends Unit{

	public String missil = "나는 미사일!";
	
	public void show(){
		System.out.println("나는 전투기!");
	}
	public void go(){
		System.out.println("전투기 날아갑니다~");
	}
	public void attack(){
		System.out.println("미사일 공격!!!");
	}
}
