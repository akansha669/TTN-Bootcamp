import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {          //Employee class
    String employeeName;
    double employeeAge;
    double employeeSalary;


    public Employee(String employeeName, double employeeAge, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }
}
class SalaryComparator implements Comparator<Employee>{
    //Comparator interface implemented here to invoke its compare() method to check greaterThan condition
    public int compare(Employee e1,Employee e2){
        return -(int)(e1.employeeSalary-e2.employeeSalary);
    }
}
public class Ques4 {
    public static void main(String []args){
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee("john",24,34000));
        emp.add(new Employee("Jayson",23,34232));
        emp.add(new Employee("Mark",28,42000));
        emp.add(new Employee("Olivia",29,51000));
        Collections.sort(emp,new SalaryComparator()); //calling compare method
        for (Employee e : emp) {
            System.out.println(e.employeeName + " is " + e.employeeAge + " and earns " + e.employeeSalary);
        }
    }
}
