package gof.designpatterns.behavioral.chainofresponsibility;

public class Client {

    public static void main(String args[]) {
        // конфигурирование цепочки
        Task root = new Task("Получить зачет");
        SubTask subTask = new SubTask(root, "Написать тест");
        Question question = new Question(subTask, "Сделать лабораторную");
        // запуск
        System.out.println("Message from Question < " + question.handleRequest() + " >");
    }
}