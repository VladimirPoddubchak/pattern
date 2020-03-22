package structural.facade;

/**
 * Created by @author Vladimir Poddubchak @date 13.03.2020.
 */

public class MessageService {
    UserDatabase userDatabase;

    public MessageService(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public void startMessageService(){
        if(userDatabase.isConnected()==true){
            System.out.println("Message Service started");
        }else{
            System.out.println("Database is not connected");
        }
    }
    public void stopMessageService(){
        System.out.println("Message Service stopped");
    }
}
