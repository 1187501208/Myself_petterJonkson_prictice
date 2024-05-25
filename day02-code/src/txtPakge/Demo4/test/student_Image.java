package txtPakge.Demo4.test;

public class student_Image {
    /*
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同
        学生的属性:学号，姓名，年龄。
        要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败，
        要求4:删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
     */

    //创建成员变量
    private int number;
    private String name;
    private int age;

    //创建构造函数
    public student_Image() {
    }
    public student_Image(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    //创建set和get方法
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
