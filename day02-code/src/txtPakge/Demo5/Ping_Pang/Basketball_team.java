package txtPakge.Demo5.Ping_Pang;

public  class Basketball_team extends Basketball {
    @Override
    public void play() {
        System.out.println("学打篮球");
    }

    public Basketball_team() {
    }

    public Basketball_team(String name, int age) {
        super(name,age);
    }

}
