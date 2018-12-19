
public class Homework1712_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=InputVal.getInt();
		int j=2;

<<<<<<< HEAD
		while(j<=i) {
			if(a%j==0){
				System.out.print("�Ҽ�");
				return;
				
			}else
				System.out.println("�Ҽ��ƴ�");

=======
		boolean isPrime=true;
		for(j=2;j<=a;j++) {
			if(a%j==0) {
				isPrime=false;
				break;
			}
>>>>>>> branch 'master' of https://github.com/SeonHyesun/JavaHomework.git
		}
		if(isPrime) {
			System.out.print(a+"는 소수입니다.");
		}else
		System.out.println(a+"는 소수가 아닙니다.");
	}
}
