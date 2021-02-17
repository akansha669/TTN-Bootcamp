abstract class MetallicFurniture {
    MetallicFurniture(){
        System.out.println("-----THIS IS A METALLIC  FURNITURE-----");
    }
}
class MetallicTable extends MetallicFurniture implements Furniture{
    static String tabletype="Metallic";
    MetallicTable(){
        super();
        System.out.println("..This is a "+tabletype+" table..");
    }

    @Override
    public void fireTest() {            //OVERRIDING FIRETEST() METHOD

        System.out.println("Metallic Tables has high resistence to fire ");
    }

    @Override
    public void stressTest() {              //OVERRIDING STRESSTEST() METHOD

        System.out.println("Metallic Tables has high resistence to stress ");
    }
}
class MetallicChair extends MetallicFurniture implements Furniture{
    static String chairtype="Metallic";
    MetallicChair(){
        super();
        System.out.println("..This is a "+chairtype+" chair..");
    }

    @Override
    public void stressTest() {                //OVERRIDING STRESSTEST() METHOD
        System.out.println("Metallic Chairs have high resistence to stress.");
    }

    @Override
    public void fireTest() {              //OVERRIDING FIRETEST() METHOD

        System.out.println("Metallic Chairs have high resistence to fire.");
    }
}
