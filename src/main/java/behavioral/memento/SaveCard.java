package behavioral.memento;

import java.util.Date;

/**
 * Created by @author Vladimir Poddubchak @date 19.03.2020.
 */

public class SaveCard {
    private final int id;
    private final String version;
    private final Date date;
    private final String name;
    private final String phone;
    private final String eMail;


    public SaveCard(int id, String version, String name, String phone, String eMail) {
        this.id = id;
        this.version = version;
        this.date = new Date();
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    public int getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String geteMail() {
        return eMail;
    }
}
