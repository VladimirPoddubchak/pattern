package structural.composite;

/**
 * Created by @author Vladimir Poddubchak @date 12.03.2020.
 */

public class Card implements MessageInterface {
    private int id;

    public Card(int id) {
        this.id = id;
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("Card id: "+ id+ " get message: "+ msg);
    }

    public int getId() {
        return id;
    }
}
