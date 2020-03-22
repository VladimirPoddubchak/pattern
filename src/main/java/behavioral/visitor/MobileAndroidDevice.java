package behavioral.visitor;

/**
 * Created by @author Vladimir Poddubchak @date 22.03.2020.
 */

public class MobileAndroidDevice implements Device {
    @Override
    public void generate(CardDesign design) {
        System.out.println("Show card design on mobile android device");
    }

    @Override
    public void generate(CardData data) {
        System.out.println("Show card data on mobile android device");
    }

    @Override
    public void generate(CardStatistic statistic) {
        System.out.println("Show card statistic on mobile android device");
    }
}
