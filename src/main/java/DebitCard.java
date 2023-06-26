public class DebitCard extends PaymentCard implements IChargeable{

    private int cardNum;
    private String expiryDate;
    private int securityNum;
    private int accNum;
    private int sortCode;


    public DebitCard(int cardNum, String expiryDate, int securityNum, int accNum, int sortCode){
        super(cardNum, expiryDate, securityNum);
        this.accNum = accNum;
        this.sortCode = sortCode;
    }


    public double charge(double transactionAmount){
        return transactionAmount;
    }



}
