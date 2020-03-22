package behavioral.memento;

import sun.security.util.Cache;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class MementoApp {
    public static void main(String[] args) throws InterruptedException {
        CardHub cardHub = new CardHub();
        Card card = new Card(1,"Bob","123-45-67","bob123@email.com");
        card.setVersionDate("0.1");
        System.out.println(card.toString());

        cardHub.setCard(card.save("0.1"));

        Thread.sleep(10000);

        card.setName("Alex");
        card.setVersionDate("0.2");
        System.out.println(card.toString());

        card.load(cardHub.getCard());
        System.out.println(card.toString());
    }
}
