package txtPakge.Demo4.test;

public class avr {
    //定义属性
    private String name;
    private int age;
    private  String sex;
    private String hob;

    //定义构造函数

    public avr() {
    }

    public avr(int age, String name, String sex, String hob) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.hob = hob;
    }

    //定义set和get方法

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHob() {
        return hob;
    }

    public void setHob(String hob) {
        this.hob = hob;
    }


}
