public class HomeworkAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aVal = InputVal.getInt();
		System.out.println("당신의 나이는  "+aVal+"입니다 ");

		double bVal = InputVal.getDouble();
		System.out.println("원주율의 값은  "+bVal+"입니다 ");

		double cVal = InputVal.getDouble1();
		System.out.println("당신의 키는  "+cVal+"입니다 ");

		double dVal = InputVal.getDouble11();
		System.out.println("당신의 몸무게는  "+dVal+"입니다 ");

		int eVal = InputVal.getInt111();
		System.out.println("정사각형의 넓이는 "+(eVal*eVal)+"입니다 ");
		
		int fVal = InputVal.getInt1111();
		int gVal = InputVal.getInt1111();
		System.out.println("삼각형의 넓이는 "+(fVal*gVal/2)+"입니다 ");
		
		int hVal = InputVal.getInt11111();
		int iVal = InputVal.getInt11111();
		int jVal = InputVal.getInt11111();
		int kVal = InputVal.getInt11111();
		int lVal = InputVal.getInt11111();
		System.out.println("5과목의 합계는  "+(hVal+iVal+jVal+kVal+lVal)+"입니다 ");
		System.out.println("5과목의 평균은  "+((hVal+iVal+jVal+kVal+lVal)/5)+"입니다 ");
	}
}
