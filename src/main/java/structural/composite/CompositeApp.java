package structural.composite;

/**
 * Created by @author Vladimir Poddubchak @date 11.03.2020.
 */

public class CompositeApp {
    public static void main(String[] args) {
        Card card1 = new Card(1);
        Card card2 = new Card(2);
        Card card3 = new Card(3);
        Card card4 = new Card(4);

        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");
        Folder folder3 = new Folder("Folder3");

        folder1.addFolder(folder2);
        folder1.addFolder(folder3);

        folder1.addCard(card1);
        folder2.addCard(card2);
        folder2.addCard(card3);
        folder3.addCard(card4);

        card1.sendMessage("Message for card 1");
        System.out.println("========================");
        folder1.sendMessage("Message for Folder1");
    }
}
