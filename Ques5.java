class Employee implements Cloneable{    //Dog class implementing cloneable interface
    String name;
    String department;
    Employee(String n,String d){   //Parametrized constructors
        this.name=n;
        this.department=d;
    }
    Employee(Employee emp){         //Copy constructor
        this.name=emp.name;
        this.department=emp.department;
    }
    public Object clone() throws CloneNotSupportedException{  //clone method to create clone
        return super.clone();
    }
    void getEmployee() {
        System.out.println(name + " works in:  " + department);
    }

}
public class Ques5 {
    public static void main(String [] args){
        Employee e1=new Employee("Akash","Technical");
        System.out.println("Original Employee: ");
        e1.getEmployee();
        Employee e2=new Employee(e1);   //using copy constructor
        System.out.println("Copied Employee: ");
        e2.getEmployee();
        try{
            Employee e3=(Employee)e1.clone();  //using clone() method
            System.out.println("Cloned Employee: ");
            e3.getEmployee();
        }
        catch(CloneNotSupportedException e) {
            System.out.println(e);
        }
        }
    }

