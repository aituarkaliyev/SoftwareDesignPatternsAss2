import sdpassiki.assik2.factorypatterns.abstractfactory.GUIFactory;
import sdpassiki.assik2.factorypatterns.abstractfactory.MacFactory;
import sdpassiki.assik2.factorypatterns.abstractfactory.WindowsFactory;
import sdpassiki.assik2.factorypatterns.client.Application;
import sdpassiki.assik2.factorypatterns.factorymethod.ShipFactory;
import sdpassiki.assik2.factorypatterns.factorymethod.TransportFactory;
import sdpassiki.assik2.factorypatterns.factorymethod.TruckFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== FACTORY METHOD ===");

        TransportFactory truckFactory = new TruckFactory();
        truckFactory.planDelivery(); //чек

        TransportFactory shipFactory = new ShipFactory();
        shipFactory.planDelivery();


        System.out.println();
        System.out.println("=== ABSTRACT FACTORY: WINDOWS ===");

        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApplication = new Application(windowsFactory);
        windowsApplication.render();


        System.out.println();
        System.out.println("=== ABSTRACT FACTORY: macOS ===");

        GUIFactory macFactory = new MacFactory();
        Application macApplication = new Application(macFactory);
        macApplication.render();
    }
}