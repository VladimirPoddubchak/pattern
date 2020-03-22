package behavioral.visitor;

/**
 * Created by @author Vladimir Poddubchak @date 22.03.2020.
 */

public class Card implements CardElement{
    CardElement[] cardElements;

    public Card() {
        this.cardElements = new CardElement[]{
                new CardDesign(),
                new CardData(),
                new CardStatistic()
        };
    }

    @Override
    public void show(Device device) {
        for (CardElement element: cardElements){
            element.show(device);
        }
    }
}
