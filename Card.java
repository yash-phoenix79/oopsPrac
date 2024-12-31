 public class Card implements PaymentMethod {
    private String cardNumber;
    private String userName;

    public Card(String cardNumber, String userName){
        this.cardNumber=cardNumber;
        this.userName=userName;
    }

    public String getCardNumber(){
        return this.cardNumber;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber=cardNumber;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }

    @Override
    public void pay() {
       System.out.println("payment via card");
    }

}
