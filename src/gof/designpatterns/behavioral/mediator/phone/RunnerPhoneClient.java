package gof.designpatterns.behavioral.mediator.phone;

import gof.designpatterns.behavioral.mediator.phone.ConcretePhoneOperatorMediator;
import gof.designpatterns.behavioral.mediator.phone.PhoneSubsciber;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * Результатом попытки звонка в телефонной системе может быть установленное соединение, сообщение о занятости абонента,
 * установка конференц-связи, сообщение о блокировке и многое другое. Для поддержки подобного функционала и будет
 * использован шаблон Mediator
 */
public class RunnerPhoneClient {
    public static void main(String[] args) {
        ConcretePhoneOperatorMediator phoneOperator = new ConcretePhoneOperatorMediator();
        PhoneSubsciber ps1 = new PhoneSubsciber(phoneOperator);
        PhoneSubsciber ps2 = new PhoneSubsciber(phoneOperator);
        PhoneSubsciber ps3 = new PhoneSubsciber(phoneOperator);
        PhoneSubsciber ps4 = new PhoneSubsciber(phoneOperator);
        phoneOperator.addPhoneSubscriber(ps1);
        phoneOperator.addPhoneSubscriber(ps2);
        phoneOperator.addPhoneSubscriber(ps3);
        // попытка двух абонентов позвонить на один номер
        ps1.call(ps2);
        ps3.call(ps2);
        // завершение разговора и повтор попытки
        ps2.finishCall();
        ps3.call(ps2);
        // попытка звонка незарегистрированным абонентом
        ps4.call(ps1);
    }
}
