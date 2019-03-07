import javax.swing.JOptionPane;

public class _09_JOptionPane {

//	JOptionPane 이란? 창 띄워서 입력받거나, 메세지를 보여주는 용도
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "하이하이");
		// 문자열을 창으로 출력
//		jop -> 자동완성 -> . -> showm -> 자동완성
		String s = JOptionPane.showInputDialog("아무거나");
		// 문자열을 창에서 입력
//		jop -> 자동완성 -> . -> showIn -> 자동완성	
		
		System.out.println(s);
		JOptionPane.showMessageDialog(null, s);
		
//		"5" -> 5 
		
		int i = Integer.parseInt(s);
		double d = Double.parseDouble(s);
		System.out.println(s + 23);
		System.out.println(i + 23);
		System.out.println(d);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
