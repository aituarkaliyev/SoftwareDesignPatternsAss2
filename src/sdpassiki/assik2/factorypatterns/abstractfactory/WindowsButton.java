package sdpassiki.assik2.factorypatterns.abstractfactory;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Windows button.");
    }
}