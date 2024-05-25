package txtPakge.Demo5.duotaiExercise;

public class dog extends animal{
    @Override
    public void eat(String something) {
        System.out.printf( "%s岁的%s颜色的狗两只前腿死死的抱住%s猛吃",this.getAge(),this.getColor(),something);
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
