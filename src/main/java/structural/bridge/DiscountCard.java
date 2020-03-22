package structural.bridge;

/**
 * Created by @author Vladimir Poddubchak @date 11.03.2020.
 */

public class DiscountCard extends AbstractCard implements CardInterface {
    @Override
    public void createCard() {
        System.out.println( "Discount card created.");
    }

    @Override
    public void editCard() {
        System.out.println( "Discount card edited.");
    }

    @Override
    public void deleteCard() {System.out.println( "Discount card deleted."); }

    @Override
    public void giveCard() {
        System.out.println( "Discount card given.");
    }

    @Override
    public void shareCard() {
        System.out.println( "Discount card shared.");
    }
}
