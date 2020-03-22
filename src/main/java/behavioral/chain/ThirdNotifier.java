package behavioral.chain;

/**
 * Created by @author Vladimir Poddubchak @date 16.03.2020.
 */

public class ThirdNotifier extends Notifier {
    public ThirdNotifier(int priority) {
        super(priority);
    }

    @Override
    public void wright(String msg) {
        System.out.println("Third notifier send message: "+msg);
    }
}
