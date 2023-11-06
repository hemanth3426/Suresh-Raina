package streamapi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	int Eid;
	String Ename;
	int Esalary;

	public Employee(int eid, String ename, int esalary) {
		super();
		Eid = eid;
		Ename = ename;
		Esalary = esalary;
	}
    
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEsalary() {
		return Esalary;
	}
	public void setEsalary(int esalary) {
		Esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Esalary=" + Esalary + "]";
	}
}

public class StreamApiDemo {

			public static void main(String[] args) {
				ArrayList<Employee> a = new ArrayList<>();
				a.add(new Employee(12, "Bob",40000));
				a.add(new Employee(13, "Jhon",50000));
				a.add(new Employee(16, "Alice",45000));
				a.add(new Employee(16, "Alice",50000));
				System.out.println(a);
				
				//count
				long count = a.stream().count();
				System.out.println("No. of Employees:"+count);
				
				Stream<Employee>s=a.stream().filter(ename->ename.getEname().startsWith("A"));
				System.out.println("Names start with A:"+s.collect(Collectors.toList()));
				
//				Stream<Employee>h=a.stream().map((esalary)->esalary+10000).collect(Collectors.toList());
//				System.out.println(h);
				
//				Integer MaxSalary=a.stream().max((i1,i2)->i1.compareTo(i2).getEsalary();
//				System.out.println("Maximum Salary is:"+MaxSalary);
//				
			
//				long start_with_s = a.stream().filter(b -> b.getEname().startsWith("A")).count();
//				System.out.println( start_with_s);
//			
//				Object max = a.stream().collect(Collectors.maxBy(Comparator.comparingDouble(b -> b.eid)));
//				System.out.println(max);
//				
//				Object avg = a.stream().collect(Collectors.averagingDouble(b -> b.eid));
//				System.out.println(avg);
//				
//				Optional<Emp> aso = a.stream().collect(Collectors.maxBy(Comparator.comparingDouble(b -> b.eid)));
//				System.out.println("Max id "+aso);
////				
//				Stream<Emp> s = a.stream().filter(name -> name.getEname().startsWith("C"));
//				System.out.println("name starts with c "+s.collect(Collectors.toList()));
			}

}
