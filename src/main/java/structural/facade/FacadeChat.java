package structural.facade;

/**
 * Created by @author Vladimir Poddubchak @date 13.03.2020.
 */

public class FacadeChat {

    public FacadeChat() {
    }

    UserDatabase userDatabase = new UserDatabase();
    OauthService oauthService = new OauthService(userDatabase);
    MessageService messageService = new MessageService(userDatabase);

    public void startChat(){
        userDatabase.connectUserDatabase();
        oauthService.startOauthService();
        messageService.startMessageService();
    }

    public void stopChat(){
        messageService.stopMessageService();
        oauthService.stopOauthService();
        userDatabase.disconnectUserDatabase();
    }
}
