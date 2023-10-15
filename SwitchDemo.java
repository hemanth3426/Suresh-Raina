package Examples;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your Marks: ");
        int Marks = scanner.nextInt();
 
        switch (Marks/10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
            	 System.out.println("Grade B");
                break;
            case 7:
            	 System.out.println("Grade C");
                break;
            case 6:
            	 System.out.println("Grade D");
                break;
            default:
            	 System.out.println("Grade E");
                break;
        }
        
      
    }
}

