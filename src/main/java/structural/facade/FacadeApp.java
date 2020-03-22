package structural.facade;

/**
 * Created by @author Vladimir Poddubchak @date 12.03.2020.
 */

public class FacadeApp {
    public static void main(String[] args) {
        FacadeChat chat = new FacadeChat();

        chat.startChat();
        System.out.println("==============");
        chat.stopChat();
    }
}
