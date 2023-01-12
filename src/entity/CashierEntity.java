package entity;

public class CashierEntity {
    private String name;
    private String username;
    private String password;

    public CashierEntity(String username, String password,String name) {
        this.username = username;
        this.password = password;
        this.name=name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
