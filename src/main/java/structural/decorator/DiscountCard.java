package structural.decorator;

/**
 * Created by @author Vladimir Poddubchak @date 12.03.2020.
 */

public class DiscountCard extends CardDecorator {
    public DiscountCard(MessageInterface card) {
        super(card);
    }

    public String sendDiscount(){
        return "Your discount is 15%!!! ";
    }

    @Override
    public String sendMessage() {
        return super.sendMessage()+sendDiscount();
    }
}
