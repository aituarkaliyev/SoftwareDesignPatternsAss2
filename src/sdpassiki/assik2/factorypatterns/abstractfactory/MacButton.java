package sdpassiki.assik2.factorypatterns.abstractfactory;

public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering macOS button.");
    }
}