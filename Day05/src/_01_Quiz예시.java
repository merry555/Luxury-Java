import javax.swing.JOptionPane;

public class _01_Quiz예시 {

	public static void main(String[] args) {
		
		// 구구단 게임
// 		jop을 사용하여 문제를 출력한 뒤 , 답을 입력받아서
//		정답인지 아닌지 출력하세요
		
		// 1~9 : 
		int a = (int)(Math.random()*9)+1;
		int b = (int)(Math.random()*9)+1;
		String msg = a + " x " + b + " = ?";
		String ans = JOptionPane.showInputDialog(msg);
		
		int ansInt = Integer.parseInt(ans);
		
		msg = (ansInt == a*b)? "정답!!!!" :"땡!!!!" ;
		JOptionPane.showMessageDialog(null, msg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
