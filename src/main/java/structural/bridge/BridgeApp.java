package structural.bridge;

/**
 * Created by @author Vladimir Poddubchak @date 11.03.2020.
 */

public class BridgeApp {
    public static void main(String[] args) {
        CardInterface privateCard = new PrivateCard();
        CardInterface discountCard = new DiscountCard();

        privateCard.createCard();
        privateCard.editCard();

        discountCard.shareCard();
        discountCard.deleteCard();
    }
}
