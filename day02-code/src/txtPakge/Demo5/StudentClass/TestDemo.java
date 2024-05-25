package txtPakge.Demo5.StudentClass;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        /*    定义学生工具类
        需求:定义一个集合，用于存储3个学生对象。
        学生类的属性为:name、age、gender
        定义一个工具类，用于获取集合中最大学生的年龄*/

        //定义集合
        ArrayList<StudentTool> list=new ArrayList<>();
        StudentTool sut1=new StudentTool("jack","12","girl");
        StudentTool sut2=new StudentTool("tom","15","boy");
        StudentTool sut3=new StudentTool("petter","21","girl");
        list.add(sut1);
        list.add(sut2);
        list.add(sut3);


        //调用工具类
        int getmax = GetMaxAgeUtil.getmax(list);
        System.out.println("最大年龄是:");
        System.out.println(getmax);
    }
}