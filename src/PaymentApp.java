public class PaymentApp {
     void pay() {
         System.out.println("Pay to buy!");
     }
}
class Upi extends PaymentApp {
    void pay() {
        System.out.println("Pay using Upi App!");
    }
}
class Wallet extends PaymentApp{
    void pay() {
        System.out.println("Pay using wallet!");
    }
}
class Card extends PaymentApp {
    void pay() {
        System.out.println("Pay using card!");
    }
}
