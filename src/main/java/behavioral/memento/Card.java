package behavioral.memento;

import java.util.Date;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class Card {
    private int id;
    private String version;
    private Date date;
    private String name;
    private String phone;
    private String eMail;

    public Card(int id, String name, String phone, String eMail) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    public SaveCard save(String version){
        return new SaveCard(id, version, name,phone,eMail);
    }

    public void load (SaveCard card){
        this.id = card.getId();
        this.version = card.getVersion();
        this.date = card.getDate();
        this.name = card.getName();
        this.phone = card.getPhone();
        this.eMail = card.geteMail();

    }

    public void setVersionDate(String version){
        this.version = version;
        this.date = new Date();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "card id: "+ id+ "\n"
                +"version: " + version + "\n"
                +"date: " + date + "\n"
                +"name: " + name + "\n"
                +"phone: " + phone + "\n"
                +"eMail: " + eMail;
    }
}
