package txtPakge.Demo5.polymorphismDemo1;

public class student extends person{
    @Override
    public void show() {
        System.out.println("学生的信息为:"+getName()+","+getAge());
    }
}
