
public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = InputVal.getInt();
		int num2 = InputVal.getInt();

		if(num1>num2) {
			System.out.println("max=" +num1+ "\t" +"min=" +num2);
		}
		else {
			System.out.println("max=" +num2+ "\t" +"min=" +num1);
		}
	}
}
