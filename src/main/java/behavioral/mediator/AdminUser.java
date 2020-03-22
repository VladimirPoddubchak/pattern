package behavioral.mediator;

/**
 * Created by @author Vladimir Poddubchak @date 18.03.2020.
 */

public class AdminUser implements UserInterface {
    private ChatInterface chat;
    private String name;

    public AdminUser(ChatInterface chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Admin "+this.name+ " get message: \""+message+"\".");
    }
}
