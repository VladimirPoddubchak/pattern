package structural.decorator;

/**
 * Created by @author Vladimir Poddubchak @date 12.03.2020.
 */

public class DecoratorApp {
    public static void main(String[] args) {
        MessageInterface card = new Card();

        System.out.println(card.sendMessage());

        MessageInterface card2 = new BirthdayCard (new DiscountCard(new Card()));
        System.out.println(card2.sendMessage());
    }
}
