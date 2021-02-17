/*Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)*/
public enum Ques9 {
    HOGWARTS(179.6), SLYTHERIN(170.3), HUFFLEPUFF(140.5), RAVENCLAW(168.9);//Enum of houses
    private double price;

    Ques9(double price) {  //constructor to set values of pricea
        this.price = price;
    }

    void getPrice() {
        System.out.println("Price of " + this.name() + ": " + this.price);
    }

    public static void main(String[] args) {
        Ques9 houseOne = Ques9.HOGWARTS;
        houseOne.getPrice();
        Ques9 houseTwo = Ques9.SLYTHERIN;
        houseTwo.getPrice();
        Ques9 houseThree = Ques9.HUFFLEPUFF;
        houseThree.getPrice();
        Ques9 houseFour = Ques9.RAVENCLAW;
        houseFour.getPrice();

    }
}
