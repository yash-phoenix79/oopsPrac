public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("RobertDebitCard", new DebitCard("124", "RObert"));
        ps.addPaymentMethod("JamiesCreditCard", new CreditCard("124", "James"));
        ps.addPaymentMethod("SheilaUPI", new Upi("909"));
        ps.addPaymentMethod("MeganWallet", new Wallet("Megaan"));

        ps.makePayment("MeganWallet");
        ps.makePayment("JamiesCreditCard");
        ps.makePayment("SheilaUPI");
        ps.makePayment("RobertDebitCard");
    }
}
