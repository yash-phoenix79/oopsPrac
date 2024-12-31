public class DebitCard extends Card{
    public DebitCard(String cardNumber, String userName){
        super(cardNumber, userName);
    }

    @Override
    public void pay() {
        // TODO Auto-generated method stub
        System.out.println("Making payment via Debit card");
    }
}
