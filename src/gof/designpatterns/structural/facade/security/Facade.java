package gof.designpatterns.structural.facade.security;

public class Facade implements IFacade {
    private SecuritySystem securitySystem;
    private SubSystem subSystem;

    public Facade() {
        this.subSystem = new SubSystem();
        this.securitySystem = new SecuritySystem();
    }

    @Override
    public void generate() {
        securitySystem.checkUser();
        securitySystem.checkRights();
        subSystem.createNode();
    }

    @Override
    public void find() {
        securitySystem.checkUser();
        subSystem.parse();
    }
}