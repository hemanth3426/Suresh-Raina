package interfacemethod;
//interface is blueprint of a class
//only abstract methods are allowed
//cannot create object
//100% abstraction can be done using interface
//interface will not allow u to write normal method inside the interface 
interface Parent1{
	abstract void Parent1Method(); 	
}
interface Parent2{
	abstract void Parent2Method();
}
class Child implements Parent1,Parent2{
	public void Parent2Method() {
		System.out.println("child class extending with parent1");
	}

	@Override
	public void Parent1Method() {
		System.out.println("child class extenging with parent2");
		
	}
}
public class MultipleInheritenceDemo{
	public static void main(String[] args) {
		Child ob=new Child();
		ob.Parent1Method();
		ob.Parent2Method();
	}
}

	
