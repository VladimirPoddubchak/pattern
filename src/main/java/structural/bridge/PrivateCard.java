package structural.bridge;

/**
 * Created by @author Vladimir Poddubchak @date 11.03.2020.
 */

public class PrivateCard extends AbstractCard implements CardInterface {
    @Override
    public void createCard() {
        System.out.println( "Private card created.");
    }

    @Override
    public void editCard() {
        System.out.println( "Private card edited.");
    }

    @Override
    public void deleteCard() {
        System.out.println( "Private card deleted.");
    }

    @Override
    public void giveCard() {
        System.out.println( "Private card given.");
    }

    @Override
    public void shareCard() {
        System.out.println( "Private card shared.");
    }
}
