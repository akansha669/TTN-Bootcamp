@FunctionalInterface
interface EmployeeRef{
	Employee empDetails(String name,int age,String city);
}
public class Employee {
	String empName;
	int age;
	String city;
	Employee(String name,int age,String city){
		this.empName=name;
		this.age=age;
		this.city=city;
	}
	
	void getEmployee() {
        System.out.println(this.empName + " is " + this.age + " and is based out of " + this.city + ".");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRef emp=Employee::new;
		Employee e1=emp.empDetails("Jason",26,"Banglore");
		e1.getEmployee();

	}

}
