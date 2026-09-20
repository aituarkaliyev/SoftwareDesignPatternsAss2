package sdpassiki.assik2.factorypatterns.client;

import sdpassiki.assik2.factorypatterns.abstractfactory.Button;
import sdpassiki.assik2.factorypatterns.abstractfactory.Checkbox;
import sdpassiki.assik2.factorypatterns.abstractfactory.GUIFactory;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}