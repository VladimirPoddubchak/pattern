package behavioral.mediator;

import structural.decorator.MessageInterface;

/**
 * Created by @author Vladimir Poddubchak @date 18.03.2020.
 */

public interface ChatInterface {
    void sendMessage(String message, UserInterface user);
}
