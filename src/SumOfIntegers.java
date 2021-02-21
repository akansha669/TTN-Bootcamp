import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(45,2,54,1,7,3,78,43,87);
		System.out.println("Sum of integers greater then 5 is: ");
		System.out.println(
				list.stream()
				.filter(x -> x>5)
				.reduce(0,(num1,num2) -> num1+num2));

	}

}
