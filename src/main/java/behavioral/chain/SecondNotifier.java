package behavioral.chain;

/**
 * Created by @author Vladimir Poddubchak @date 16.03.2020.
 */

public class SecondNotifier extends Notifier {
    public SecondNotifier(int priority) {
        super(priority);
    }

    @Override
    public void wright(String msg) {
        System.out.println("Second notifier send message: "+msg);
    }
}
