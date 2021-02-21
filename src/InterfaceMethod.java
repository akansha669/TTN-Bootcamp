@FunctionalInterface
interface InterfaceMethodDemo{
	public static void message() {
		System.out.println("Hi ,I am Static method");
	}
	default void display2() {
		System.out.println("Hi i am Default method");
	}
	void interfaceMethod();
}
public class InterfaceMethod implements InterfaceMethodDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMethod interMeth=new InterfaceMethod();
		interMeth.display2();
		InterfaceMethodDemo.message();
		interMeth.interfaceMethod();

	}

	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		System.out.println("Hi i am a method of InterfaceMethodDemo inteface");
		
	}

}
