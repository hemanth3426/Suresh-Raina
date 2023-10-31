package filesystem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewFileDemo {
	
	public static void main(String[] args) throws IOException {
		
		//Step 1.creating file
//		File ob=new File("File1.txt");
//		if(ob.createNewFile()) {
//			System.out.println("File Created");
//		}
//		else {
//			System.out.println("File Exist");
//		}
		
		//to create file in same package
//		File ob=new File("C:\\Users\\Hemanth\\eclipse-workspace\\CoreJavaProject\\src\\filesystem\\File1.txt");
//		if(ob.createNewFile()) {
//			System.out.println("File Created");
//		}
//		else {
//			System.out.println("File Exist");
//		}
		
	    //step 2.get info about the file
//		File ob=new File("File1.txt");
//		if(ob.exists()) {
//			System.out.println("Name of the file is: "+ob.getName());
//			System.out.println("Path ::"+ob.getAbsolutePath());
//			System.out.println("Length: "+ob.length());
//			System.out.println("Can read ?: "+ob.canRead());
//			System.out.println("Can Write ?: "+ob.canWrite());
//		}
//		else {
//			System.out.println("File not found");
//		}
		
		//step 3.write file
//        FileWriter ob=new FileWriter("File1.txt");
//        ob.write("Java is object orieanted language");
//        System.out.println("Written Successfully");
//        ob.close();
		
		//step 4.read file
		File ob=new File("File1.txt");
		Scanner sc=new Scanner(ob);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}

}
