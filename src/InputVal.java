import javax.swing.JOptionPane;

public class InputVal {
	public static int getInt() {
		String input = JOptionPane.showInputDialog("입력");
		int result = Integer.parseInt(input);
		return result;
	}
	public static double getDouble() {
		String input = JOptionPane.showInputDialog("원주율의 값은 얼마입니까? ");
		double result = Double.parseDouble(input);
		return result;
	}
	public static double getDouble1() {
		String input = JOptionPane.showInputDialog("당신의 키와 몸무게를 입력하세요 ");
		double result = Double.parseDouble(input);
		return result;
	}
	public static double getDouble11() {
		String input = JOptionPane.showInputDialog("당신의 키와 몸무게를 입력하세요 ");
		double result = Double.parseDouble(input);
		return result;	
	}
	public static int getInt111() {
		String input = JOptionPane.showInputDialog("정사각형의 한 변의 길이를 입력하세요 ");
		int result = Integer.parseInt(input);
		return result;
	}
	public static int getInt1111() {
		String input = JOptionPane.showInputDialog("삼각형의 밑변과 높이를 입력하세요 ");
		int result = Integer.parseInt(input);
		return result;
	}
	public static int getInt11111() {
		String input = JOptionPane.showInputDialog("과목 1-5의 점수를 정수로 입력하세요 ");
		int result = Integer.parseInt(input);
		return result;
	}
}
