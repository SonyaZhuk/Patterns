package gof.designpatterns.behavioral.state.gumballstate;

public interface State {
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
	void refill();
}
