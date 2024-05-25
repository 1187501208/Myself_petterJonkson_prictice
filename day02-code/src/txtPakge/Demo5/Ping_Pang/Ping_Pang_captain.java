package txtPakge.Demo5.Ping_Pang;

public class Ping_Pang_captain extends Ping_Pang{
    public Ping_Pang_captain() {
    }

    public Ping_Pang_captain(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("教打乒乓球");
    }
}
