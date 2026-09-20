package sdpassiki.assik2.factorypatterns.factorymethod;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering cargo by ship.");
    }
}