package txtPakge.Demo4;

public class StudentTest {
    public static void main(String[] args) {
        //使用构造方法
        Student s=new Student();
        Student s2=new Student("小明",12);

        System.out.println(s2.getName());
        System.out.println(s2.getAge());

    }
}
