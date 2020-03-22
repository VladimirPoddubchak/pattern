package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by @author Vladimir Poddubchak @date 14.03.2020.
 */

public class CardFactory {
    static Map<String,CardTemplate> cardTemplates = new HashMap<>();

    private static  CardTemplate getCardTemplate(String templateName,String dataColor, String dataFont, String dataSize, String designFile){
        CardTemplate result = cardTemplates.get(templateName);
        if (result==null){
            result = new CardTemplate(templateName,dataColor,dataFont,dataSize,designFile);
            cardTemplates.put(templateName, result);
            System.out.println("Template "+templateName+" added to Catalog.");
        }
        return result;
    }

    public static Card makeCard(String templateName, String dataColor, String dataFont, String dataSiz, String designFile,
                         String name, String phone, String eMail, String address){

        return new Card(name,phone,eMail,address,CardFactory.getCardTemplate(templateName,dataColor,dataFont,dataSiz,designFile));
    }
}
