@FunctionalInterface
interface StringConcatination{
	String concatStrings(String s1,String s2);
}
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcatination str1=(s1,s2)->s1.concat(s2);
		System.out.println("Akansha concated with Singh is:   "+ str1.concatStrings("Akansha","Singh"));

	}

}
