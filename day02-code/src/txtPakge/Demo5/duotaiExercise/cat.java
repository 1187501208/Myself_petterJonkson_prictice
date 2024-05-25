package txtPakge.Demo5.duotaiExercise;

public class cat extends animal{
    @Override
    public void eat(String something) {
        System.out.printf("%S岁的%S颜色的猫眯着眼睛侧着头吃%S",this.getAge(),this.getColor(),something);
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
