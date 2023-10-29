package collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class CricketPlayer {
    int JercyNo;
    String Fname;
    String Lname;

    public CricketPlayer(int JercyNo, String Fname, String Lname) {
        super();
        this.JercyNo = JercyNo;
        this.Fname = Fname;
        this.Lname = Lname;
    }
    
    public int getJercyNo() {
        return JercyNo;
    }

    public void setJercyNo(int JercyNo) {
        this.JercyNo= JercyNo;
    }

    public String getFname() {
        return Fname;
    }

    public void setLname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLdegree(String Lname) {
        this.Lname = Lname;
    }

    @Override
    public String toString() {
        return "CricketPlayer [JercyNo=" + JercyNo + ", Fname=" + Fname + ", Lname=" + Lname + "]";
    }
}

public class CrudOperation {

    public static void main(String[] args) {

        ArrayList<CricketPlayer> ob = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Insert Data");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("0. Exit");
            System.out.println("Enter Your Choice ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter JercyNo ");
                    int JercyNo = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    System.out.print("Enter Fname ");
                    String Fname = sc.nextLine();
                    System.out.print("Enter Lname ");
                    String Lname = sc.nextLine();
                    ob.add(new CricketPlayer(JercyNo, Fname, Lname));
                    break;

                case 2:
                    Iterator<CricketPlayer> itr = ob.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;
            }
       

       
        }while(choice !=0);
        sc.close();
        
    }
    
}


