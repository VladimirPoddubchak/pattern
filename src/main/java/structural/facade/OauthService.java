package structural.facade;

/**
 * Created by @author Vladimir Poddubchak @date 13.03.2020.
 */

public class OauthService {
    UserDatabase userDatabase;

    public OauthService(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public void startOauthService(){
        if(userDatabase.isConnected() == true){
            System.out.println("Oauth Service started.");
        }else {
            System.out.println("Database is not connected");
        }
    }
    public void stopOauthService(){
        System.out.println("Oauth Service stopped.");
    }
}
