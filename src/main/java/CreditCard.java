public class CreditCard extends PaymentCard implements IChargeable, IReduce{
    private int cardNum;
    private String expiryDate;
    private int securityNum;
    private double availableCredit;


    public CreditCard(int cardNum, String expiryDate, int securityNum, double availableCredit){
        super(cardNum, expiryDate, securityNum);
        this.availableCredit = availableCredit;
    }


    public double charge(double transactionAmount){
        return transactionAmount * 1.01;
    }

    public double reduce(double costOfPurchase){
        return this.availableCredit -= charge(costOfPurchase);
    }
}
