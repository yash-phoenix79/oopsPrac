public class Wallet implements PaymentMethod {
    private String name;

    public Wallet(String name){
        this.name = name;
    }

    @Override
    public void pay() {
        System.out.println("Payment made via Wallet");
    }
}
