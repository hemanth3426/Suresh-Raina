package Examples;
import java.util.Scanner;
public class StarPattern {
	public static void main(String[] args) {
	
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//i=row,j=space,k=star
			
//		for(int i=1;i<=4;i++) {
//			for(int j=3;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=4;i++) {
//			for(int j=0;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=4;i++) {
//			for(int j=3;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
    
//		for(int i=1;i<=4;i++) {
//		   for(int j=2;j<=i;j++) {
//			   System.out.print(" ");
//		}
//		for(int k=4;k>=i;k--) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter The number of rows");
	    int row=sc.nextInt();
	 	for(int i=1;i<=row;i++) {
			   for(int j=2;j<=i;j++) {
				   System.out.print(" ");
			}
			for(int k=row;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
