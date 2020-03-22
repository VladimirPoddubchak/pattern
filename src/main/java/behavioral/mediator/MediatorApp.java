package behavioral.mediator;

/**
 * Created by @author Vladimir Poddubchak @date 18.03.2020.
 */

public class MediatorApp {
    public static void main(String[] args) {
        Chat chat = new Chat();
        UserInterface admin = new AdminUser(chat, "ADMIN");
        UserInterface user1 = new SimpleUser(chat, "USER1");
        UserInterface user2 = new SimpleUser(chat, "USER2");
        UserInterface user3 = new SimpleUser(chat, "USER3");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        chat.sendMessage("Hello from admin",admin);
        chat.sendMessage("Hello, i,m user1",user1);
    }
}
