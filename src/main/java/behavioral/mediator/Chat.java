package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author Vladimir Poddubchak @date 18.03.2020.
 */

public class Chat implements ChatInterface {
    UserInterface admin;
    List<UserInterface> users = new ArrayList<>();

    public void setAdmin(UserInterface admin){
        this.admin=admin;
    }

    public void addUser(UserInterface user){
        users.add(user);
    }

    @Override
    public void sendMessage(String message, UserInterface user) {
        for (UserInterface u: users){
            if (u!=user) {
                u.receiveMessage(message);
            }
        }
        admin.receiveMessage(message);
    }
}
