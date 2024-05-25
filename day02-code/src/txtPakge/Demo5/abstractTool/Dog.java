package txtPakge.Demo5.abstractTool;

public class Dog extends Animal implements swim{
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }
}
