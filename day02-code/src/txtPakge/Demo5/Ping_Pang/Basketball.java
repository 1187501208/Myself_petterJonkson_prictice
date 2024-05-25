package txtPakge.Demo5.Ping_Pang;

public abstract class Basketball extends sports_man implements play{
    public Basketball(String name, int age) {
        super(name,age);
    }

    public Basketball() {
    }

    public abstract void play();

}
