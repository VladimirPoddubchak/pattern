package behavioral.visitor;

/**
 * Created by @author Vladimir Poddubchak @date 22.03.2020.
 */

public class CardStatistic implements CardElement{
    @Override
    public void show(Device device) {
        device.generate(this);
    }
}
