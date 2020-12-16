package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testscore {
public static void main(String[] args) {
	
String answer = JOptionPane.showInputDialog("What was your last test score?");
	
double answerInt = Double.parseDouble(answer);	
	if(answerInt >= 90) {
		JOptionPane.showMessageDialog(null, "Wow, you got an A! You must have studied hard for that test!");
	}
	else if(answerInt >= 80 && answerInt < 90) {
		JOptionPane.showMessageDialog(null, "You got a B! Well done.");
	}
	else if(answerInt >= 70 && answerInt < 80) {
		JOptionPane.showMessageDialog(null, "You got a C. At least you passed, but study harder next time.");
		
	}
	else if(answerInt >= 60 && answerInt < 70) {
		JOptionPane.showMessageDialog(null, "You got a D. You need to work harder.");
	}
	else if(answerInt < 60) {
		JOptionPane.showMessageDialog(null, "You got an F. You need to work much harder.");
	}
}
}
