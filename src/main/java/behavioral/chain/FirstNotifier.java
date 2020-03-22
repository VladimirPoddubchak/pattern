package behavioral.chain;

/**
 * Created by @author Vladimir Poddubchak @date 16.03.2020.
 */

public class FirstNotifier extends Notifier {
    public FirstNotifier(int priority) {
        super(priority);
    }

    @Override
    public void wright(String msg) {
        System.out.println("First notifier send message: "+msg);
    }
}
