package pck_Src;

public class Triangle extends Shape {

	public double base;	// πÿ∫Ø
	public double height; 	// ≥Ù¿Ã
	
	public void setArea(){
		this.area = base * height / 2; 
	}
	public void setCircum(){
		double a = (base/2)*(base/2) + (height)*(height);
		this.circum = (Math.sqrt(a))*2 + base;
	}
}
