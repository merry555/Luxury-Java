package pck_Src;

public class Tank extends Unit{

//	@ �ּ� : annotation => ��ǻ�Ϳ��� �����ϴ� �ּ�
//	@Override : �������̵��ϴ� �޼ҵ��!
	
	@Override
	public int attack(Unit a) {
		// TODO Auto-generated method stub
		System.out.println(a.name+"�� �����ߴ�!");
		return 100;
	}
	public void go(int a){
		System.out.println("��ũ, " + a +"��ŭ �̵��߽��ϴ�.. " );
	}
	
	
	
	
	
	
	
	
}
