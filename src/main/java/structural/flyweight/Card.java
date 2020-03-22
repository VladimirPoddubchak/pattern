package structural.flyweight;

/**
 * Created by @author Vladimir Poddubchak @date 14.03.2020.
 */

public class Card {
    private int id;
    private  String name;
    private  String phone;
    private  String eMail;
    private  String address;
    private  CardTemplate template;

    static int idCounter;

    public Card(String name, String phone, String eMail, String address, CardTemplate template) {
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
        this.address = address;
        this.template = template;
        this.id = idCounter++;
    }
    public void printCard(){
        String templateInfo = " ("+template.getDataFont()+" ,"+template.getDataSize()+" ,"+template.getDataColor()+")";

        System.out.println("Card id: "+ id);
        System.out.println("template:"+ template.getTemplateName());
        System.out.println("name: "+name+ templateInfo);
        System.out.println("phone: "+phone+ templateInfo);
        System.out.println("eMail: "+eMail+ templateInfo);
        System.out.println("address: "+address+ templateInfo);
        System.out.println("background file: "+ template.getDesignFile());
    }

    public long getId() {
        return id;
    }
}
