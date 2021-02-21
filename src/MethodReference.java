interface Demo{
	 int processIntegers(int numberOne, int numberTwo);
}
public class MethodReference {
	int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    
    int subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
    
    static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo=new MethodReference()::add;
		System.out.println("Adding Values: " + demo.processIntegers(34, 46));
		demo=new MethodReference()::subtract;
		System.out.println("Subtracting values: "+demo.processIntegers(43,9));
		demo = MethodReference::multiply;
        System.out.println("Multiplying values: " + demo.processIntegers(34, 34));
		

	}

}
