package behavioral.strategy;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class Project {
    private  String name;
    State state;

    public Project(String name) {
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void process(){
        System.out.print(name + ": ");
        state.doAction();
    }
}
