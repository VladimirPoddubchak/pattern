package behavioral.visitor;

import java.awt.*;

/**
 * Created by @author Vladimir Poddubchak @date 22.03.2020.
 */

public class CardDesign implements CardElement{
    @Override
    public void show(Device device) {
        device.generate(this);
    }
}
