import java.util.ArrayList;

public class Wallet {
    private ArrayList<IChargeable>cardsInWallet;
    private SelectedCard selectedCard;

    public Wallet(SelectedCard selectedCard, ArrayList<IChargeable>cardsInWallet){
        this.cardsInWallet = cardsInWallet;
        this.selectedCard = selectedCard;
    }


}
