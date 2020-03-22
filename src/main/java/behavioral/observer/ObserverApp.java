package behavioral.observer;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class ObserverApp {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        Card card1 = new Card(1,"Alex","111-11-11","alex111@email.com");
        Card card2 = new Card(2,"Bob","222-22-22","bob222@email.com");
        Card card3 = new Card(3,"Vlad","333-33-33","vlad333@email.com");

        user1.addCard(card1);

        user2.addCard(card1);
        user2.addCard(card2);

        user3.addCard(card1);
        user3.addCard(card2);
        user3.addCard(card3);

        card3.setName("NewName");
        card1.setPhone("NewPhone");

    }
}
