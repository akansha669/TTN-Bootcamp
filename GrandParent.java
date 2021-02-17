public class GrandParent {
    static {
        System.out.println("static - grandparent");
    }

    {
        System.out.println("instance - grandparent");
    }

    public GrandParent() {
        System.out.println("constructor - grandparent");
    }
}
