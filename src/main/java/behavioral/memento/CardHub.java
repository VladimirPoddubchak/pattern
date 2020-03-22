package behavioral.memento;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class CardHub {
    private SaveCard card;

    public SaveCard getCard() {
        return card;
    }

    public void setCard(SaveCard card) {
        this.card = card;
    }
}
