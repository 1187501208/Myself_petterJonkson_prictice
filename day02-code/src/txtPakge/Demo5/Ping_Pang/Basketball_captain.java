package txtPakge.Demo5.Ping_Pang;

public class Basketball_captain extends Basketball {
    @Override
    public void play() {
        System.out.println("教打篮球");
    }

    public Basketball_captain() {
    }

    public Basketball_captain(String name, int age) {
        super(name, age);
    }
}
