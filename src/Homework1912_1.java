
public class Homework1912_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=InputVal.getInt();
		
		for(int i=0;i<input.length/2;i++) {
			inputArr[i]=input.charAt(i);
		}
		boolean isPalindrome=true;
		for(int i=0;i<inputArr.length/2;i++) {
			if(inputArr[i]!=inputArr[inputArr.length-1-i]) {
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println(input+"은 회문입니다.");
		}else
			System.out.println(input+"은 회문이 아닙니다.");

	}

}
