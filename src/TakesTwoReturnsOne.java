@FunctionalInterface
interface TakesTwoReturnsOneInter {
    int returnOne(int numberOne, int numberTwo);
}
public class TakesTwoReturnsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TakesTwoReturnsOneInter takesTwoReturnsOne = (numberOne, numberTwo) -> numberOne + numberTwo;
	        
	        System.out.println("5 plus 7: " + takesTwoReturnsOne.returnOne(5, 7));

	}

}
