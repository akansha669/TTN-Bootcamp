@FunctionalInterface
interface IncrementByOne{
	int addByOne(int number);
}
public class IncrementByOneDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncrementByOne increment=number-> number + 1;
		System.out.println("5 after incrementing 1 is: "+increment.addByOne(5));

	}

}
