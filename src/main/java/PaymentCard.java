public abstract class PaymentCard {
    private int cardNum;
    private String expiryDate;
    private int securityNum;



    public PaymentCard(int cardNum, String expiryDate, int securityNum){
        this.cardNum = cardNum;
        this.expiryDate = expiryDate;
        this.securityNum = securityNum;
    }


    public String logsTransactions(){
        return "Woo you've just made a transaction";
    }


}
