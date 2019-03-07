package pck_Src;

public class Circle extends Shape{
	public double radius;
	public void setArea(){
		area = radius*radius*3.14;
	}
	public void setCircum(){
		circum = radius*2*3.14;
	}
}
