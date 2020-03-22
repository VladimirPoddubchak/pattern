package behavioral.strategy;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class StrategyApp {
    public static void main(String[] args) {
        Project project = new Project("Project1");

        project.setState(new Planning());
        project.process();

        project.setState(new Feedback());
        project.process();

        project.setState(new Implementing());
        project.process();

        project.setState(new Testing());
        project.process();

    }
}
