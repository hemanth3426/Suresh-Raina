package basicprograms;
import java.util.Scanner;

public class EvenOddCount {
	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
//		int num=2234;
		int even_count=0;
		int odd_count=0;
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("even count: "+even_count);
		System.out.println("odd count: "+odd_count);
		System.out.println();
	}	
}	
}
