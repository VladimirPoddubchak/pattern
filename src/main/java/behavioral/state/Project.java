package behavioral.state;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class Project {
    private  String name;
    State state;

    public Project(String name) {
        this.name = name;
        this.state = new Planning();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextStep(){
        if (state instanceof Planning){
            setState(new Feedback());
        }else if(state instanceof Feedback){
            setState(new Implementing());
        }else if(state instanceof Implementing){
            setState(new Testing());
        }else if(state instanceof Testing){
            setState(new Planning());
        }
    }

    public void process(){
        System.out.print(name + ": ");
        state.doAction();
    }
}
