public class Giftcard implements IChargeable, IReduce {

    private double balance;

    public Giftcard(double balance){
        this.balance = balance;
    }

    public double charge(double transactionAmount){
        return transactionAmount;
    }

    public double reduce(double transactionAmount){
        return this.balance -= charge(transactionAmount);
    }
}
