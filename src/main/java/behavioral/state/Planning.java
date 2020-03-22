package behavioral.state;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class Planning implements State{

    @Override
    public void doAction() {
        System.out.println("Planning");
    }

}
