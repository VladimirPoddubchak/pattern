package behavioral.observer;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class Card implements Observed{
    private List<Observer> observers = new ArrayList();
    private int id;
    private String name;
    private String phone;
    private String eMail;

    public Card(int id, String name, String phone, String eMail) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "card id: "+ id+ "\n"
                +"name: " + name + "\n"
                +"phone: " + phone + "\n"
                +"eMail: " + eMail + "\n";
    }


    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.handleEvent(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        notifyObservers();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
        notifyObservers();
    }
}
