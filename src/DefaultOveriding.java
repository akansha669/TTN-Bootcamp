interface DefaultMethodOveriding{
	default void display() {
		System.out.println("This is Default display method of interface ");
	}
	
}
public class DefaultOveriding implements DefaultMethodOveriding{
	public void display() {
		System.out.println("This display method belongs to class which is implementing the interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultOveriding obj=new DefaultOveriding();
		obj.display();

	}

}
