package behavioral.template;

/**
 * Created by @author Vladimir Poddubchak @date 22.03.2020.
 */

public abstract class AbstractTemplateClass {
    public void method1(){
        System.out.println("Method1 from AbstractTemplateClass");
    }
    public abstract void method2();

    public void method3(){
        System.out.println("Method1 from AbstractTemplateClass");
    }

    public void doAllMethods(){
        method1();
        method2();
        method3();
    }

}
