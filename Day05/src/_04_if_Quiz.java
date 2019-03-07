import javax.swing.JOptionPane;

public class _04_if_Quiz {

	public static void main(String[] args) {
		
//		실습 : 이름과, 나이를 jop 사용해서 입력 받고,
//		나이에 맞게 가야하는 학교를 출력하세요 
//		(유치원, 초등학교, 중학교, 고등학교)
//		4살 이상 7살 이하 : 유치원
//		8살 이상 13살 이하 : 초등학교 ....
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요..");
		String strAge = JOptionPane.showInputDialog("나이를 입력하세요..");
		
		int age = Integer.parseInt(strAge);
		String school;
		if(age >= 4 && age <= 7)
			school = "유치원";
		else if(age >= 8 && age <= 13)
			school = "초등학교";
		else if(age >= 14 && age <= 16)
			school = "중학교";
		else if(age >= 17 && age <= 19)
			school = "고등학교";
		else school = "해당사항없음";
		
		String shwMsg = 
				"이름 : " + name + "\n"
				+ "나이 : " + age + "살 \n"
				+ name + "님은 " + school + "에 가야합니다.";
		
		JOptionPane.showMessageDialog(null, shwMsg);
				
	}
}
