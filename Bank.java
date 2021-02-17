public class Bank {     //Parent Bank
    String bankName;
    double rateOfInterest;
    Bank(String name,double interest){    //Parameterized constructor
        bankName=name;
        rateOfInterest=interest;
    }
    void getDetails(){               //method to return bank details
        System.out.println("BANK DETAILS\n");
        System.out.println("Bank Name: "+this.bankName);
        System.out.println("Rate Of Interest: "+this.rateOfInterest);
    }
    public static void main(String []args){
        Bank mainBank =new Bank("Reserve Bank of India",6.5);
        mainBank.getDetails();
        SBIbank sbi=new SBIbank("State bank of India",5.3);
        sbi.getDetails();
        ICICIbank icici=new ICICIbank("Industrial Credit and Investment Corporation of India",4.3);
        icici.getDetails();
        BOIbank boi=new BOIbank("Bank Of India",7.3);
        boi.getDetails();

    }
}
