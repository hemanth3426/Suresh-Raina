package basicprograms;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==num) {
			System.out.println("It is palinrdrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		System.out.println("rev: "+rev);
		System.out.println();
	}
	}	
}
