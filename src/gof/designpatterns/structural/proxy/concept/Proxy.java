package gof.designpatterns.structural.proxy.concept;

public class Proxy implements BaseInterface {
    private BaseClass base = null;

    public void perform() {
        base = new BaseClass();
        base.perform();
    }
}

