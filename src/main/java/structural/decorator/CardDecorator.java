package structural.decorator;

/**
 * Created by @author Vladimir Poddubchak @date 12.03.2020.
 */

public class CardDecorator implements MessageInterface {
    MessageInterface card;

    public CardDecorator(MessageInterface card) {
        this.card = card;
    }

    @Override
    public String sendMessage() {
        return card.sendMessage();
  }
}
