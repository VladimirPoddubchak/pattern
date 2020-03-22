package structural.facade;

/**
 * Created by @author Vladimir Poddubchak @date 13.03.2020.
 */

public class UserDatabase {
    private boolean isConnected;
    public void connectUserDatabase(){
        isConnected = true;
        System.out.println("Database connected");
    }
    public void disconnectUserDatabase(){
        isConnected =false;
        System.out.println("Database disconnected");
    }

    public boolean isConnected() {
        return isConnected;
    }
}
