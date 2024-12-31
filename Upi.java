public class Upi implements PaymentMethod {
    private String id;

    public Upi(String id){
        this.id=id;
    }

    @Override
    public void pay() {
        System.out.println("Payment made via UPI");
    }
}
