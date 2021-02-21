import java.util.Arrays;
import java.util.List;

public class FirstEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,23,56,12,86,1,8,3);
		System.out.println(
				list.stream()
				.filter(x -> x > 3 )
				.filter(x -> x % 2==0 )
				.findFirst()
				);

	}

}
