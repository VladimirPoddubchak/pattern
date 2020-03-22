package behavioral.template;

/**
 * Created by @author Vladimir Poddubchak @date 22.03.2020.
 */

public class TemplateApp {
    public static void main(String[] args) {
        AbstractTemplateClass class1 = new Class1();
        AbstractTemplateClass class2 = new Class2();

        class1.doAllMethods();
        class2.doAllMethods();
    }
}
