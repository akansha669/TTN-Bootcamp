public class Parent extends GrandParent {
    static {
        System.out.println("static - parent");
    }

    {
        System.out.println("instance - parent");
    }

    public Parent() {
        System.out.println("constructor - parent");
    }
}
