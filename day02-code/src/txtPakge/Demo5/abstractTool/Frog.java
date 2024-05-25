package txtPakge.Demo5.abstractTool;

public class Frog extends Animal implements swim{
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    public Frog() {
        super();
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }
}
