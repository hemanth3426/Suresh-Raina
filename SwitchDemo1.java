package Examples;
import java.util.Scanner;

public class SwitchDemo1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the month num: ");
	        int num = scanner.nextInt();

	        switch (num) {
	          
	            case 1:
	                System.out.println("Your Month is Jan");
	                break;
	            case 2:
	            	 System.out.println("Your Month is feb");
	                break;
	            case 3:
	            	 System.out.println("Your Month is March");
	                break;
	            case 4:
	            	 System.out.println("Your Month is Apr");
	                break;
	            case 5:
	            	 System.out.println("Your Month is May");
	                break;
	            case 6:
	            	 System.out.println("Your Month is June");
	                break;
	            case 7:
	            	 System.out.println("Your Month is July");
	                break;
	            case 8:
	            	 System.out.println("Your Month is Aug");
	                break;
	            case 9:
	            	 System.out.println("Your Month is Sep");
	                break;
	            case 10:
	            	 System.out.println("Your Month is Oct");
	                break;
	            case 11:
	            	 System.out.println("Your Month is Nov");
	                break;
	            case 12:
	            	 System.out.println("Your Month is Dec");
	                break;
	            default:
	            	 System.out.println("Invalid Month");
	                break;
	        }
	        
	      
	    }
	}

