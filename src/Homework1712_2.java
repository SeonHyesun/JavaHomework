
public class Homework1712_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=InputVal.getInt();
		int j=2;

		boolean isPrime=true;
		for(j=2;j<=a;j++) {
			if(a%j==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.print(a+"는 소수입니다.");
		}else
		System.out.println(a+"는 소수가 아닙니다.");
	}
}
