package inheritence;
class Parent{
	public void properties() {
	System.out.println("Parent Property");	
   }
}

class Child extends Parent{
	public void details() {
		System.out.println("Aquiring property from parent");
	}
}

public class ParentProperties { 
    public static void main(String[] args) {
    	Child ob=new Child();//we have create object for child class so we can aquire both parent and child properties
    	 ob.properties();
    	 ob.details();
    }
}
//inheritence types
//1.single
//2.multi level
//3.hirarchical
//4.multiple
//5.hybrid

