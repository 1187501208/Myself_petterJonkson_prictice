package txtPakge.Demo5.polymorphismDemo1;

public class teacher extends person{
    @Override
    public void show(){
        System.out.println("老师的信息为:"+getName()+","+getAge());
    }
}
