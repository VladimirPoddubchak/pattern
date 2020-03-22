package behavioral.strategy;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class Feedback implements State {

    @Override
    public void doAction() {
        System.out.println("Feedback");
    }

}
