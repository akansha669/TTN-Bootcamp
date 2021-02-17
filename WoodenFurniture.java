abstract class WoodenFurniture {
    WoodenFurniture(){
        System.out.println("-----THIS IS A WOODEN FURNITURE-----");
    }
}
class WoodenTable extends WoodenFurniture implements Furniture{
    static String tabletype="Wooden";
    WoodenTable(){
        super();
        System.out.println("..This is a "+tabletype+" table..");
    }

    @Override
    public void fireTest() {    //OVERRIDING FIRETEST() METHOD

        System.out.println("Wooden Tables has low resistence to fire ");
    }

    @Override
    public void stressTest() {      //OVERRIDING STRESSTEST() METHOD

        System.out.println("Wooden Tables has low resistence to stress ");
    }
}
class WoodenChair extends WoodenFurniture implements Furniture{
    static String chairtype="Wooden";
    WoodenChair(){
        super();
        System.out.println("..This is a "+chairtype+" chair..");
    }

    @Override
    public void stressTest() {             //OVERRIDING STRESSTEST() METHOD
        System.out.println("Wooden Chairs have low resistence to stress.");
    }

    @Override
    public void fireTest() {       //OVERRIDING FIRETEST() METHOD

        System.out.println("Wooden Chairs have low resistence to fire.");
    }
}

