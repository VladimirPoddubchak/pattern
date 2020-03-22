package structural.proxy;

import structural.flyweight.Card;
import structural.flyweight.CardFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author Vladimir Poddubchak @date 14.03.2020.
 */

public class RemoteCatalog  implements Catalog{
    static private List<Card> catalog = new ArrayList<>();

    @Override
    public Card getCard(int id) {
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e){}
//        System.out.println("Load card id: "+ id+ " from remote catalog....");
        return catalog.get(id);
    }

    public void init(int counter) {
        final String[] NAMES = {"Anton", "Boris", "Denis", "Vlad", "Anna", "Olga", "Kate"};
        final String[] TEMPLATES = {"Biz", "Car", "Girl", "Sport", "Summer"};
        final String[] COLORS = {"black", "white", "green", "red", "blue","pink","red"};
        final String[] FONTS = {"Arial", "Sans", "Serif", "Times"};
        final String[] SIZES = {"8", "10", "12", "14", "16", "18", "20"};

        for (int i=0; i<counter; i++) {
            String template = TEMPLATES[(int) (Math.random() * (TEMPLATES.length))];
            String color = COLORS[(int) (Math.random() * (COLORS.length))];
            String font = FONTS[(int) (Math.random() * (FONTS.length))];
            String size = SIZES[(int) (Math.random() * (SIZES.length))];
            String file = template + ".png";
            String name = NAMES[(int) (Math.random() * (NAMES.length))];
            String phone = "" + (int) (Math.random() * 999) + "-" + (int)(Math.random() * 99) + "-" + (int)(Math.random() * 99);
            String eMail = name + (int)(Math.random() * 999) + "@gmail.com";
            String address = "address";

            Card card = CardFactory.makeCard(template, color, font, size, file, name, phone, eMail, address);

            catalog.add(card);
        }

    }
    public static int getCatalogSize(){
        return catalog.size();
    }
}