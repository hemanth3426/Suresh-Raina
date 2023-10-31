package basicprograms;
import java.util.Scanner;
public class PrimeNumbers {

	 public static void main(String[] args) {
		 while(true) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int num=sc.nextInt();
		 int factors=0;
		 for(int i=1;i<=num;i++) {
			 if(num%i==0) {
				 factors++;
			 }
		 }
		 if(factors==2) {
			 System.out.println("it is a Prime");
		 }
		 else {
			 System.out.println("Its not a prime");
		 }
		 System.out.println();
	 }
	 }
}
