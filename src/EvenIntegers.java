import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(21,45,31,78,43,42,58);
		System.out.println("Sum of even Integers is: ");
		System.out.println(
				list.stream()
				.filter(x -> x%2 == 0)
				.collect(Collectors.toList()));

	}

}
