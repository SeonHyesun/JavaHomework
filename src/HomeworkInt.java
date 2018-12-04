
public class HomeworkInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeworkInt hom = new HomeworkInt();
		//		hom.clone01();
		hom.clone02();
	}
	public void clone01() {
		System.out.println("0보다 큰 세 정수를 순서대로 입력하시오");
		int input = InputVal.getInt();
		if(input%2 <= 0) {
			System.out.println(input);
		}else {
			System.out.println();
		}
		int input1 = InputVal.getInt();
		if(input1%2 <= 0) {
			System.out.println(input1);
		}else {
			System.out.println();
		}
		int input2 = InputVal.getInt();
		if(input2%2 <= 0) {
			System.out.println(input2);
		}else {
			System.out.println();
		}
	}
	public void clone02() {
		System.out.println("0보다 큰 정수 한개를 입력하시요");
		int input = InputVal.getInt();
		if(input>=0 && input%2<=0) {
			System.out.println("양수입니다. 짝수입니다.");
		}else if(input>=0 && input%2!=0) {
			System.out.println("양수입니다. 홀수입니다.");
		}else if(input<=0 && input%2!=0) {
			System.out.println("음수 입니다. 홀수 입니다.");
		}else
			System.out.println("음수 입니다.짝수입니다.");
	}
}

