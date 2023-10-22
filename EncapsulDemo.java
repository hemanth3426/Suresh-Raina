package encapsulation;
//this will give security
//dat
 class WorkerDemo{
	private String name;
	private int age;
	private int RollNo;
	
	WorkerDemo(String name,int age,int RollNo){
		this.name=name;
		this.age=age;
		this.RollNo=RollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
 }
	
public class EncapsulDemo {
	
	public static void main(String args[]) {
	WorkerDemo ob=new WorkerDemo("Hemanth",22,3);
	
	System.out.println("name "+ob.getName());
	System.out.println("age "+ob.getAge());
	System.out.println("RollNo "+ob.getRollNo() );
	
	ob.setName("Gowda");
	ob.setAge(23);
	ob.setRollNo(5);
	
	System.out.println("Update name:"+ob.getName());
	System.out.println("Update age:"+ob.getAge());
	System.out.println("Update RollNo:"+ob.getRollNo());
}
}


