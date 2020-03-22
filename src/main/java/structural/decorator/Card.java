package structural.decorator;

/**
 * Created by @author Vladimir Poddubchak @date 12.03.2020.
 */

public class Card implements MessageInterface {

    @Override
    public String sendMessage() {
        return ("Card get message. ");
    }

}
