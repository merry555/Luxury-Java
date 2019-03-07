import javax.swing.JOptionPane;

// 설계도용 클래스
public class Student {
	// <설계용 클래스> : 이름, 국,영,수 점수, 평균, 학점
	// 메소드 : 
	// - 이름 입력 메소드 
	// - 국, 영, 수 입력 받고, 평균, 학점 구하는 메소드
	// - 정보 보여주는 메소드 
	String name;
	int kr, en, ma;
	char grade;
	double avg;
	
	void setName(){
		name = JOptionPane.showInputDialog("이름");
	}
	void setData(){
		String k = JOptionPane.showInputDialog("국어");
		String e = JOptionPane.showInputDialog("영어");
		String m = JOptionPane.showInputDialog("수학");
		kr = Integer.parseInt(k);
		en = Integer.parseInt(e);
		ma = Integer.parseInt(m);
		
		avg = (kr+en+ma)/3.0;
		
		if(avg>=90) grade = 'A';
		else if(avg>= 80) grade = 'B';
		else if(avg>= 70) grade = 'C';
		else if(avg>= 60) grade = 'D';
		else grade = 'F';
	}
	
	void showFields(){
		String shw = "";
		shw += "이름 : " + name + "\n"
				+ "평균 : " + avg + "\n"
				+ "학점 : " + grade + "\n";
		JOptionPane.showMessageDialog(null,shw);
	}
}













