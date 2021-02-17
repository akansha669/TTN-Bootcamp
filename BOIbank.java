public class BOIbank extends Bank{
    BOIbank(String name,double interest){
        super(name,interest);
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Thanks For visiting: "+this.bankName);
    }
}
