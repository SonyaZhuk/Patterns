package gof.designpatterns.structural.decorator.it;

/**
 * класс-декоратор, уточняющий базовую функциональность сотрудника # DeveloperDecorator.java
 * Класс DeveloperDecorator объявляет дополнительные функциональности startProgress() и endProgress(),
 * необходимые для разработчика, дополняя (декорируя) функциональности openTask(), reopenTask(), resolveTask() класса Employee
 */
public class DeveloperDecorator extends EmployeeDecorator {
    public DeveloperDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        startProgress();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        startProgress();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
        stopProgress();
    }

    public void startProgress() {
        System.out.println(employee.getName() + " starting task");
    }

    public void stopProgress() {
        System.out.println(employee.getName() + " stopping task");
    }
}