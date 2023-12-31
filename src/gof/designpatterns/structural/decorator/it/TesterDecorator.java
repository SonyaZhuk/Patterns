package gof.designpatterns.structural.decorator.it;

/**
 * классы-декоратор сотрудника тестировщика и team-лидера #  TesterDecorator.java # TeamLeadDecorator.java
 */
public class TesterDecorator extends EmployeeDecorator {
    // поля, методы
    public TesterDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        testing();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        testing();
    }

    @Override
    public void resolveTask() {
        reporting();
        super.resolveTask();
    }

    public void testing() {
        System.out.println(employee.getName() + " testing task");
    }

    public void reporting() {
        System.out.println(employee.getName() + " create report");
    }
}