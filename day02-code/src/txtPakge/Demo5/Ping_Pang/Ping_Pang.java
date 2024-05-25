package txtPakge.Demo5.Ping_Pang;

public class Ping_Pang extends sports_man implements play{
    public void Speak(){
        System.out.println("说英语");
    }

    public Ping_Pang() {
    }

    public Ping_Pang(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("打乒乓球");
    }
}
