package gof.designpatterns.structural.bridge.account;

/**
 * # абстракция и ее уточнения # Account.java # DepositAccount.java # CreditAccount.java
 *
 * Класс Action — абстрактный, реализующий Implementor (IAction). Может содержать общие методы для всех действий,
 * например: проверку прав пользователя, блокировку счета и т. д. Классы RegularAction и UrgentAction уточняют подклассы
 * класса Action.
 */
public abstract class Action implements IAction {
   public void operation() {
       // more code
   }
}
