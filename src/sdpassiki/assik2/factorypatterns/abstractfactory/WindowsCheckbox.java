package sdpassiki.assik2.factorypatterns.abstractfactory;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox.");
    }
}