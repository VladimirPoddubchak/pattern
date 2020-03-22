package behavioral.chain;

/**
 * Created by @author Vladimir Poddubchak @date 16.03.2020.
 */

public abstract class Notifier {
    private int priority;
    public Notifier(int priority) {
        this.priority = priority;
    }

    private Notifier nextNotifier;
    public void setNextNotifier(Notifier next) {
        this.nextNotifier = next;
    }

    public void notifyManager(String msg, int level){
        if (level>= priority){
            wright(msg);
        }
        if (nextNotifier!=null){
            nextNotifier.notifyManager(msg,level);
        }
    }

    public abstract void wright(String msg);
}
