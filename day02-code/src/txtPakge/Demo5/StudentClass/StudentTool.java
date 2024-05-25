package txtPakge.Demo5.StudentClass;

public class StudentTool {
    /*    定义学生工具类
        需求:定义一个集合，用于存储3个学生对象。
        学生类的属性为:name、age、gender
        定义一个工具类，用于获取集合中最大学生的年龄*/

    private String name;
    private String age;
    private String gander;

    public StudentTool() {
    }

    public StudentTool(String name, String age, String gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }
}
