import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Consumer
        Consumer<Integer> consumer = myInt -> System.out.println("Adding 23 to 68: " + (myInt + 23));
        consumer.accept(68);
        
        // Supplier
        Supplier<Integer> supplier = () -> 44 * 25;
        System.out.println("44 multiplied by 25: " + supplier.get());
        
        // Predicate
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        System.out.println("Is 6 even? " + predicate.test(6));
        
        // Function
        Function<String, Integer> function = myString -> myString.length();
        System.out.println("Length of 'Akansha': " + function.apply("Akansha"));
	}

}
