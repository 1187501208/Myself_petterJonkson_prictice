package txtPakge.Demo4;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStudentListInput {
    public static void main(String[] args) {
        /*需求:定义一个集合，添加一些学生对象，并进行遍历学生类的属性为:姓名，年龄。
        要求:对象的数据来自键盘录入
         */

        //创建集群
        ArrayList<Student> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        //添加对象
        //注意:这里list.size()大小初始值为0,需要手动设置添加的字符串数量
        for (int i = 0; i < 3; i++) {
            System.out.println("输入名字:");
            String name=sc.next();
            System.out.println("输入年龄:");
            int age=sc.nextInt();
            Student s=new Student(name,age);
            list.add(s);
        }
        //打印结果
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+","+list.get(i).getAge());
        }
    }
}
