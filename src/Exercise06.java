
public class Exercise06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise06 exr = new Exercise06();
//		exr.practice01();
//		exr.practice02();
		exr.practice03();
	}
	//	1-10까지 숫자 중 짝수만 출력합니다
	public void practice01() {
		System.out.println("1-10까지 숫자 중 짝수만 출력합니다");
		for(int i=1; i<=10; i++) {
			if(i%2 == 0)
				System.out.println(i);
		}
		System.out.println();
	}

	//1단부터 9단까지 구구단을 출력하는 프로그램 작성 
	public void  practice02() {
		System.out.println("1-9단까지 구구단 출력");
		for(int j=1; j<10; j++) {
			for(int i=1; i<10; i++) {
				System.out.println(j +"*"+ i +"=" + j*i + "\t");
			}
			System.out.println();
		}
	}
	//계단 모양으로 *을 출력 
	public void practice03() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}