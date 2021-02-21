
interface MultipleInheritenceDemo1{
	default void display() {
		System.out.println("This method is default method in  first interface");
	}
}
interface MultipleInheritenceDemo2{
	default void display() {
		System.out.println("This method is default method in second interface");
	}
	
}
public class MultipleInheritence implements MultipleInheritenceDemo1,MultipleInheritenceDemo2{
	public void display() {
		MultipleInheritenceDemo1.super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritence mul=new MultipleInheritence();
		mul.display();

	}

}
