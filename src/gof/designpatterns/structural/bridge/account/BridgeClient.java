package gof.designpatterns.structural.bridge.account;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * использование шаблона Bridge
 * <p>
 * <p>
 * Пусть существует некое банковское учреждение, совершающее действия по кредитным, депозитным и прочим счетам.
 * Экземпляры счетов-Abstraction выполняют действия. Действия могут быть обычными, срочными и другими.
 * Срочное обслуживание стоит клиенту дороже, так как повышаются ежемесячные платежи, теряются проценты и проч.
 * Видов счетов в реальной банковской сфере существует достаточно много, как и действий, производимых над ними.
 * Если каждому типу счета ставить в соответствие свою реализацию действия, то общее число классов, требуемых к созданию,
 * будет равно произведению числа типов счетов на число возможных действий. Добавление же одного нового типа счета,
 * потребует создания классов в количестве, равном числу действий. Классы Action-Implementor отделены от Account-Abstraction,
 * причем так, чтобы реализации ничего не знали в идеале об абстракциях.
 * <p>
 * Реализация больше не имеет постоянной привязки к интерфейсу.
 * Реализацию абстракции можно динамически изменять и конфигурировать во время выполнения. Иерархии классов Abstraction и
 * Implementor независимы и могут иметь любое число подклассов.
 */
public class BridgeClient {

    public static void main(String[] args) {
        Action action = new RegularAction();
        DepositAccount depositAccount = new DepositAccount(action);
        depositAccount.setId(777);
        depositAccount.setAmount(1500);
        depositAccount.takeSum(200);
        action = new UrgentAction();
        depositAccount.setAction(action);
        // replacement action
        depositAccount.takeSum(100);
        new CreditAccount(action).takeSum(50);
    }
}
