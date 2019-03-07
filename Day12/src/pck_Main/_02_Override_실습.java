package pck_Main;

import java.nio.ReadOnlyBufferException;

import javax.swing.JOptionPane;

import pck_Src.Circle;
import pck_Src.Rectangle;
import pck_Src.Triangle;

public class _02_Override_실습 {

	public static void main(String[] args) {
		/*
		 *  실습 : 도형 넓이, 둘레 계산 프로그램 
		 *  < 설계용 클래스 >
		 *  1. Shape (부모 클래스)
		 *  	멤버 ? 
		 *  	메소드1 : 넓이 계산 
		 *  	메소드2 : 둘레 계산
		 *  2. Triangle 
		 *  	멤버 ? 
		 *  	메소드1, 메소드2 오버라이딩 하세요
		 *  3. Rectangle
		 *  	멤버 ? 
		 *  	메소드1, 메소드2 오버라이딩 하세요	
		 *  4. Circle
		 *  	멤버 ? 
		 *  	메소드1, 메소드2 오버라이딩 하세요
		 *  < 메인용 클래스 >
		 *  메뉴 :
		 *  	1. 삼각형
		 *  	2. 사각형
		 *  	3. 원
		 *  기능 : 
		 *   	1 선택 -> 밑변, 높이 입력 -> 넓이, 둘레 출력
		 *   	2 선택 -> 변1, 변2 입력 -> 넓이, 둘레 출력
		 *   	3 선택 -> 반지름 입력 -> 넓이, 둘레 출력
		 */
		menu: while(true){
			String shwMsg = "1. 삼각형\n2. 사각형 \n3. 원\n4. 종료";
			String ans = JOptionPane.showInputDialog(shwMsg);
			switch(ans){
			case "1":
				Triangle t = new Triangle();
				String a = JOptionPane.showInputDialog("밑변");
				String b = JOptionPane.showInputDialog("높이");
				t.base = Double.parseDouble(a);
				t.height = Double.parseDouble(b);
				t.setArea();
				t.setCircum();
				shwMsg = "넓이 : " + t.getArea() + ", 둘레 : " + t.getCircum();           
				JOptionPane.showMessageDialog(null, shwMsg);
				break;
			case "2":
				Rectangle r = new Rectangle();
				String c = JOptionPane.showInputDialog("첫 번째 변");
				String d = JOptionPane.showInputDialog("두 번째 변");
				r.base1 = Double.parseDouble(c);
				r.base2 = Double.parseDouble(d);
				r.setArea();
				r.setCircum();
				shwMsg = "넓이 : " + r.getArea() + ", 둘레 : " + r.getCircum();           
				JOptionPane.showMessageDialog(null, shwMsg);
				break;
			case "3":
				Circle cir = new Circle();
				String e = JOptionPane.showInputDialog("반지름");
				cir.radius = Double.parseDouble(e);
				cir.setArea();
				cir.setCircum();
				shwMsg = "넓이 : " + cir.getArea() + ", 둘레 : " + cir.getCircum();           
				JOptionPane.showMessageDialog(null, shwMsg);
				break;
			case "4":
				break menu;
			default : JOptionPane.showMessageDialog(null, "잘못 입력");
			}
		}
	}
}
















