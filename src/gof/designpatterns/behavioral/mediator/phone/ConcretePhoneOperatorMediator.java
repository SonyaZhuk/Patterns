package gof.designpatterns.behavioral.mediator.phone;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * функционал медиатора и его реализация
 */
public class ConcretePhoneOperatorMediator implements PhoneOperatorMediator {
    private Set<PhoneSubsciber> subscribers;
    private Map<PhoneSubsciber, PhoneSubsciber> connections;
    private long nextPhoneNumber;

    public ConcretePhoneOperatorMediator() {
        subscribers = new HashSet<PhoneSubsciber>();
        connections = new HashMap<PhoneSubsciber, PhoneSubsciber>();
        nextPhoneNumber = 200_00_01;
    }

    @Override
    public long generatePhoneNumber() {
        return nextPhoneNumber++;
    }

    @Override
    public void addPhoneSubscriber(PhoneSubsciber ps) {
        subscribers.add(ps);
    }

    @Override
    public boolean connect(PhoneSubsciber ps1, PhoneSubsciber ps2) {
        if (!isSupported(ps1) || !isSupported(ps2)) {
            return false;
        }
        if (connections.containsKey(ps1) || connections.containsKey(ps2)) {
            System.out.println("Line is busy...");
            return false;
        }
        connections.put(ps1, ps2);
        connections.put(ps2, ps1);
        System.out.println(ps1 + " connected to " + ps2); return true;
    }
    @Override
    public boolean disconnect(PhoneSubsciber ps1) {
        if (connections.containsKey(ps1)) {
            PhoneSubsciber ps2 = connections.get(ps1);
            connections.remove(ps1);
            connections.remove(ps2);
            System.out.println(ps1 + " disconnected fom " + ps2);
            return true;
        } else {
            System.out.println(ps1 + " not connected to any subscriber");
            return false;
        }
    }
    @Override
    public boolean isSupported(PhoneSubsciber ps) {
        boolean isSupported = subscribers.contains(ps);
        if (!isSupported) {
            System.out.println("Not supported " + ps);
        } return isSupported;
    }
}
