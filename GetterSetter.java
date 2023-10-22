package encapsulation;
 
//private method
class Bank{
	static String BranchName;
	private String BankName;
	private int Balance;
	
	public void BranchName(){
		System.out.println("Bengaluru Branch");
	}
	
	//constructor
	public Bank(String bankName, int balance) {
		super();
		BankName = bankName;
		Balance = balance;
	}
	
	//getter setter
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	
	//user methods
	public double deposit(double amount) {
		return Balance+=amount;
	}
	public double withdraw(double amount) {
		if(amount>Balance) {
			System.out.println(".....Insufficiant balance......");
		}
		else {
			System.out.println("Thank you");
		}
		return Balance-=amount;
	}
	
	
}
public class GetterSetter {
	public static void main(String args[]) {

		Bank ob=new Bank("SBI",5000);
		ob.BranchName();
		System.out.println(ob.getBankName());
		System.out.println(ob.getBalance());
		System.out.println("After deposite:"+ob.deposit(5000));
		System.out.println("After withdraw:"+ob.withdraw(11000));
		
		System.out.println();
		
		Bank ob1=new Bank("HDFC",6000);
		ob1.BranchName();
		System.out.println(ob1.getBankName());
		System.out.println(ob1.getBalance());
		System.out.println("After deposite:"+ob1.deposit(5000));
		System.out.println("After withdraw:"+ob1.withdraw(3000));
		
	}

}
