@FunctionalInterface
interface StringUpper{
	String upperString(String str);
}
public class StringToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUpper strUpper = myString -> myString.toUpperCase();
        
        System.out.println("akansha in uppercase: " + strUpper.upperString("akansha"));

	}

}
