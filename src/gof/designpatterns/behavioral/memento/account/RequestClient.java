package gof.designpatterns.behavioral.memento.account;


import java.util.HashMap;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * сохранение и восстановление состояния
 * сохранение состояния счета клиента перед каким-либо серьезным действием с ним.
 * Например, перед транзакцией, чтобы в случае неудачно завершенной транзакции восстановить предшествующее состояние.
 * При обращении клиентской страницы к серверу вместе с запросом передается набор параметров, представляющих информацию,
 * введенную клиентом в поля формы. Если какая-либо часть информации неккорректна, то приложение предлагает клиенту
 * вернуться на форму и исправить ошибки, при этом все поля формы, передаваемой клиенту для коррекции, должны быть заполнены
 * той же самой информацией.
 */
public class RequestClient {
    public static void main(String[] args) {
        HashMap<String, String> p = new HashMap<>() {{
            this.put("1", "Winner");
        }};
        RequestParameter req = new RequestParameter(p);
        System.out.println("first " + req.getParams());
        Memento memento = req.getMemento();
        Caretaker care = new Caretaker(memento);
        req.addParam("1", "Loser");
        System.out.println("second " + req.getParams());
        memento = care.getMemento();
        req.setMemento(memento);
        System.out.println("undo to first " + req.getParams());
    }
}
