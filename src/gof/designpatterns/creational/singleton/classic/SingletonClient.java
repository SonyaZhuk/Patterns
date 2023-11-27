package gof.designpatterns.creational.singleton.classic;

// classic version
public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
