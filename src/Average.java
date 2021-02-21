import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,43,6,45,87,12);
		System.out.println("Average is: ");
		System.out.println(
				list.stream()
				.map(x -> x*2)
				.collect(Collectors.averagingInt(Integer::intValue))
				);

	}

}
