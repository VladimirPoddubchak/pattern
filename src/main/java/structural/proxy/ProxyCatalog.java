package structural.proxy;

import structural.flyweight.Card;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by @author Vladimir Poddubchak @date 14.03.2020.
 */

public class ProxyCatalog implements Catalog{
    RemoteCatalog remoteCatalog;
    Map<Integer, Card> cashCatalog = new HashMap<>();

    @Override
    public Card getCard(int id) {
        Card result;
        if (remoteCatalog==null){
            remoteCatalog = new RemoteCatalog();
        }
        if (cashCatalog.containsKey(id)){
//            System.out.println("Get card id: "+ id+ " from local structural.proxy....");
            result = cashCatalog.get(id);
        }else{
            result = remoteCatalog.getCard(id);
            cashCatalog.put(id,result);
        }
        return result;
    }

}
