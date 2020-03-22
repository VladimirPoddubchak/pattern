package structural.flyweight;

/**
 * Created by @author Vladimir Poddubchak @date 14.03.2020.
 */

public class CardTemplate {
    private String templateName;
    private String dataColor;
    private String dataFont;
    private String dataSize;
    private String designFile;


    public CardTemplate(String templateName, String dataColor, String dataFont, String dataSize, String designFile) {
        this.templateName = templateName;
        this.dataColor = dataColor;
        this.dataFont = dataFont;
        this.dataSize = dataSize;
        this.designFile = designFile;
    }

    public String getTemplateName() {
        return templateName;
    }

    public String getDataColor() {
        return dataColor;
    }

    public String getDataFont() {
        return dataFont;
    }

    public String getDataSize() {
        return dataSize;
    }

    public String getDesignFile() {
        return designFile;
    }
}
