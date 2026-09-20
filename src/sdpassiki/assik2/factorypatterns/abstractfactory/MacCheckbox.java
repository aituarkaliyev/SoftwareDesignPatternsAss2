package sdpassiki.assik2.factorypatterns.abstractfactory;

public class MacCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Rendering macOS checkbox.");
    }
}