package txtPakge.Demo5.Ping_Pang;

public class Ping_pang_team extends Ping_Pang{
    @Override
    public void play() {
        System.out.println("学打乒乓球");
    }

    public Ping_pang_team() {
    }

    public Ping_pang_team(String name, int age) {
        super(name, age);
    }
}
