package behavioral.state;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class StateApp {
    public static void main(String[] args) {
        Project agile = new Project("Project1");

        for (int i=1; i<=12; i++){

            agile.process();
            agile.nextStep();
        }


    }
}
