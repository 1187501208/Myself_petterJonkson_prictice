package txtPakge.Demo5.abstractTool;

public class Sheep extends Animal {
    @Override
    public void eat() {
        System.out.println("吃草");
    }

    public Sheep() {
        super();
    }

    public Sheep(String name, int age) {
        super(name, age);
    }
}
