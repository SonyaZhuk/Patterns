package gof.designpatterns.behavioral.mediator.phone;

/**
 * функционал медиатора и его реализация
 */
public interface PhoneOperatorMediator {
    long generatePhoneNumber();
    void addPhoneSubscriber(PhoneSubsciber ps);
    boolean isSupported(PhoneSubsciber ps);
    boolean connect(PhoneSubsciber ps1, PhoneSubsciber ps2);
    boolean disconnect(PhoneSubsciber ps);
}
