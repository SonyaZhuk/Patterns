package gof.designpatterns.structural.decorator.it;

/**
 * класс-декоратор для интерфейса IEmployee # EmployeeDecorator.java
 * Класс EmployeeDecorator определяет для набора декораторов интерфейс,
 * соответствующий интерфейсу класса IEmployee, и создает необходимые ссылки.
 */
public abstract class EmployeeDecorator implements IEmployee {
    protected Employee employee;

    public EmployeeDecorator() {
        super();
    }

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void resolveTask() {
        employee.resolveTask();
    }

    @Override
    public void openTask() {
        employee.openTask();
    }

    @Override
    public void reopenTask() {
        employee.reopenTask();
    }
}