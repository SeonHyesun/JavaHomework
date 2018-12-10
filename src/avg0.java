
public class avg0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=InputVal.getInt();
		int sum=+input;
		int count=+1;

		do {
	
			double avg=sum/count;

			System.out.println("평균은"+avg+"입니다.");
		} while (input==0);
	}
}
