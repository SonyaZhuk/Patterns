package gof.designpatterns.structural.bridge.remote;

public class TVFactory {
	public TV getTV(String type) throws Exception {
		switch (type) {
			case "LG" : return new LG();
			case "Sony" : return new Sony();
			default: throw new Exception("Invalid TV Type");
		}
	}
}