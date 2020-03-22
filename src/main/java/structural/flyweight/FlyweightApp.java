package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author Vladimir Poddubchak @date 14.03.2020.
 */

public class FlyweightApp {
    public static void main(String[] args) {

        List<Card> catalog = new ArrayList<>();

        catalog.add(CardFactory.makeCard("Biz","black","Font1","12","money.png",
                "Peter","111-11-11","111@email.com","address 111"));
        catalog.add(CardFactory.makeCard("Biz","black","Font1","12","money.png",
                "Maks","222-22-22","222@email.com","address 222"));
        catalog.add(CardFactory.makeCard("Biz",null,null,null,null,
                "Ivan","333-33-33","333@email.com","address 333"));
        catalog.add(CardFactory.makeCard("Girl","pink","Italic","10","pony.png",
                "Helga","444-44-44","444@email.com","address 444"));
        catalog.add(CardFactory.makeCard("Car","red","Font3","12","car.png",
                "Vlad","555-55-55","555@email.com","address 555"));
        catalog.add(CardFactory.makeCard("Girl","black","Font1","12","money.png",
                "Kate","666-66-66","666@email.com","address 666"));


        for (Card card: catalog){card.printCard();}
    }

}
