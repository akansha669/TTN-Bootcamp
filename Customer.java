public class Customer {
    int tokenNumber;
    Customer() {
        System.out.println("I'm a customer in CafeCoffee.");
    }
    // Calls createOrder() in Cashier
    void placeOrder(Cashier cashier) {

        tokenNumber = cashier.createOrder();
    }
    void enjoyDrink() {
        // Notified by barista when order ready
        System.out.println("Thanks for the coffee!");
    }

}
