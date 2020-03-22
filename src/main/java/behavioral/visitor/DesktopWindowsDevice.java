package behavioral.visitor;

/**
 * Created by @author Vladimir Poddubchak @date 22.03.2020.
 */

public class DesktopWindowsDevice implements Device {
    @Override
    public void generate(CardDesign design) {
        System.out.println("Show card design on desktop windows device");
    }

    @Override
    public void generate(CardData data) {
        System.out.println("Show card data on desktop windows device");
    }

    @Override
    public void generate(CardStatistic statistic) {
        System.out.println("Show card statistic on desktop windows device");
    }
}
