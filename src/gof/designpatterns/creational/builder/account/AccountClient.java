package gof.designpatterns.creational.builder.account;

public class AccountClient {

    public static void main(String[] arg) {
        Account account = new Account.Builder().setUserId("1").setToken("token").build();
    }
}
