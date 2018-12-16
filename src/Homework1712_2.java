
public class Homework1712_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=InputVal.getInt();
		int i=a-1;
		int j=2;

		while(j<=i) {
			if(a%j==0){
				System.out.print("소수입니다.");
			}else
				System.out.println("소수가 아닙니다.");

		}
	}
}
