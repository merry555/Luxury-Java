package pck_Src;

public class Rectangle extends Shape{

	public double base1, base2;
	
	public void setArea(){
		this.area = base1 * base2;
	}
	public void setCircum(){
		this.circum = (base1 + base2)*2;
	}
}
