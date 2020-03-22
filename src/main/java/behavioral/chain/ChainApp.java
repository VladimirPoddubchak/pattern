package behavioral.chain;

/**
 * Created by @author Vladimir Poddubchak @date 16.03.2020.
 */

public class ChainApp {

    public static void main(String[] args) {
        Notifier first = new FirstNotifier(1);
        Notifier second = new SecondNotifier(2);
        Notifier third = new ThirdNotifier(3);

        first.setNextNotifier(second);
        second.setNextNotifier(third);

        first.notifyManager("Hello",1);
        first.notifyManager("Alarm",3);
    }



}
