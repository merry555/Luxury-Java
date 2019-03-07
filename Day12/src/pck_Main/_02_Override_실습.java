package pck_Main;

import java.nio.ReadOnlyBufferException;

import javax.swing.JOptionPane;

import pck_Src.Circle;
import pck_Src.Rectangle;
import pck_Src.Triangle;

public class _02_Override_�ǽ� {

	public static void main(String[] args) {
		/*
		 *  �ǽ� : ���� ����, �ѷ� ��� ���α׷� 
		 *  < ����� Ŭ���� >
		 *  1. Shape (�θ� Ŭ����)
		 *  	��� ? 
		 *  	�޼ҵ�1 : ���� ��� 
		 *  	�޼ҵ�2 : �ѷ� ���
		 *  2. Triangle 
		 *  	��� ? 
		 *  	�޼ҵ�1, �޼ҵ�2 �������̵� �ϼ���
		 *  3. Rectangle
		 *  	��� ? 
		 *  	�޼ҵ�1, �޼ҵ�2 �������̵� �ϼ���	
		 *  4. Circle
		 *  	��� ? 
		 *  	�޼ҵ�1, �޼ҵ�2 �������̵� �ϼ���
		 *  < ���ο� Ŭ���� >
		 *  �޴� :
		 *  	1. �ﰢ��
		 *  	2. �簢��
		 *  	3. ��
		 *  ��� : 
		 *   	1 ���� -> �غ�, ���� �Է� -> ����, �ѷ� ���
		 *   	2 ���� -> ��1, ��2 �Է� -> ����, �ѷ� ���
		 *   	3 ���� -> ������ �Է� -> ����, �ѷ� ���
		 */
		menu: while(true){
			String shwMsg = "1. �ﰢ��\n2. �簢�� \n3. ��\n4. ����";
			String ans = JOptionPane.showInputDialog(shwMsg);
			switch(ans){
			case "1":
				Triangle t = new Triangle();
				String a = JOptionPane.showInputDialog("�غ�");
				String b = JOptionPane.showInputDialog("����");
				t.base = Double.parseDouble(a);
				t.height = Double.parseDouble(b);
				t.setArea();
				t.setCircum();
				shwMsg = "���� : " + t.getArea() + ", �ѷ� : " + t.getCircum();           
				JOptionPane.showMessageDialog(null, shwMsg);
				break;
			case "2":
				Rectangle r = new Rectangle();
				String c = JOptionPane.showInputDialog("ù ��° ��");
				String d = JOptionPane.showInputDialog("�� ��° ��");
				r.base1 = Double.parseDouble(c);
				r.base2 = Double.parseDouble(d);
				r.setArea();
				r.setCircum();
				shwMsg = "���� : " + r.getArea() + ", �ѷ� : " + r.getCircum();           
				JOptionPane.showMessageDialog(null, shwMsg);
				break;
			case "3":
				Circle cir = new Circle();
				String e = JOptionPane.showInputDialog("������");
				cir.radius = Double.parseDouble(e);
				cir.setArea();
				cir.setCircum();
				shwMsg = "���� : " + cir.getArea() + ", �ѷ� : " + cir.getCircum();           
				JOptionPane.showMessageDialog(null, shwMsg);
				break;
			case "4":
				break menu;
			default : JOptionPane.showMessageDialog(null, "�߸� �Է�");
			}
		}
	}
}
















