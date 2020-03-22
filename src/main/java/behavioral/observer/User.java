package behavioral.observer;

import behavioral.memento.SaveCard;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    private Map<Integer,Card> cardBook = new HashMap<>();

    public void addCard(Card card){
        this.cardBook.put(card.getId(),card);
        card.addObserver(this);
    }

    @Override
    public void handleEvent(Card editedCard) {
        System.out.println("User: "+this.name +" notified. Card id: "+ editedCard.getId()+" some data was edited");
        this.cardBook.put(editedCard.getId(),editedCard);
        System.out.println(cardBook.get(editedCard.getId()).toString());
    }
}
