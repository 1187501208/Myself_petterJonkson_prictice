package txtPakge.Demo4;

public class Student {
    //构造方法


    private  String Name;
    private int age;


    //空参构造
    //没有写空参构造,虚拟机会自动构造一个
    public Student(){
        System.out.println("看看我执行了吗");
    }

    //调用带参构造
    public Student(String name,int age){
        this.Name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }
}
