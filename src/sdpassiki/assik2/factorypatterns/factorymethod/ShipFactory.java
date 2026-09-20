package sdpassiki.assik2.factorypatterns.factorymethod;

public class ShipFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}