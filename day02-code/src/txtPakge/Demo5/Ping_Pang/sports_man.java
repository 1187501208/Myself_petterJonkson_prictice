package txtPakge.Demo5.Ping_Pang;

public abstract class sports_man {
    public String name;
    public int age;

    public sports_man() {
    }

    public sports_man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
