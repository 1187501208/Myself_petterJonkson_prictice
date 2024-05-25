package txtPakge.Demo5.Dog;

public class Husky extends Dogs {
    @Override
    public void eat() {
        System.out.print("哈士奇");
        super.eat();
    }

    public void breakHome(){
        System.out.println("拆家");
    }
}
