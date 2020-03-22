package behavioral.visitor;

/**
 * Created by @author Vladimir Poddubchak @date 22.03.2020.
 */

public interface Device {
    void generate(CardDesign design);
    void generate(CardData data);
    void generate(CardStatistic statistic);
}
