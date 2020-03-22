package behavioral.visitor;

/**
 * Created by @author Vladimir Poddubchak @date 22.03.2020.
 */

public class VisitorApp {
    public static void main(String[] args) {
        CardElement card = new Card();

        Device mobile = new MobileAndroidDevice();
        Device desktop = new DesktopWindowsDevice();

        card.show(mobile);
        System.out.println("==================================");
        card.show(desktop);
    }
}
