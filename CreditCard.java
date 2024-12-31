public class CreditCard extends Card {
    public CreditCard(String cardNumber, String userName){
        super(cardNumber, userName);
    }

    @Override
    public void pay() {
        // TODO Auto-generated method stub
        System.out.println("Making payment via Credit card");
    }
}
