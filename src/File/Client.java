package File;

public class Client {

    public int id;
    public String login;
    public String name;

    Client(int id, String login, String name){
        this.id=id;
        this.login=login;
        this.name=name;
        System.out.println(getName());
    }

    private String getName() {
        return "User: "+name;
    }
}
