
public class Homework1712_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		int c=2;
		int cnt=2;
		int hap=4;

		for(;cnt<20;cnt++) {
			b=a;
			b=c;
			c=a+b;
			hap=+c;
		}
		System.out.println(hap);


	}

}
