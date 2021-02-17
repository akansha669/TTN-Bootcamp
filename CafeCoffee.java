import java.util.*;
public class CafeCoffee {
    private Barista barista;
    private Cashier cashier;
    private CafeOrder cafeorder;
    private Customer customer;

    CafeCoffee() {
        System.out.println("Welcome to Cafe Coffee!");
        //this.cafeOrderQueue = new LinkedList<>();
    }


    public void setBarista(Barista barista) {
        this.barista = barista;
    }
    public void setCafeOrder(CafeOrder cafeorder) {
        this.cafeorder = cafeorder;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    /*public void startServingCustomers(Cashier cashier) {
        for (Customer c : this.customer) {
            c.placeOrder(cashier);
        }
    }*/

    public static void main(String[] args) {
        CafeCoffee cafe = new CafeCoffee();
        Barista barista = new Barista();
        Cashier cashier = new Cashier();
        cafe.setCashier(cashier);
        cafe.setBarista(barista);
        // Create customers
        Customer customerOne = new Customer();
        Customer customerTwo = new Customer();

        cafe.setCustomer(customerOne);
        cafe.setCustomer(customerTwo);
        // Begin operations
        //cafe.startServingCustomers(cashier);
    }
}
