package behavioral.mediator;

import structural.decorator.MessageInterface;

/**
 * Created by @author Vladimir Poddubchak @date 18.03.2020.
 */

public interface UserInterface {
    public void sendMessage(String message);
    public void receiveMessage(String message);
}
