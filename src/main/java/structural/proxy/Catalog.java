package structural.proxy;

import structural.flyweight.Card;

/**
 * Created by @author Vladimir Poddubchak @date 14.03.2020.
 */

public interface Catalog {
    Card getCard(int id);
}
