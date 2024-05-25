package txtPakge.Demo4;

import java.util.ArrayList;

public class GetStudentList {
    public static void main(String[] args) {
        //添加学生对象到集合中,并展示

        //定义集合
        ArrayList<Student> list=new ArrayList<>();
        //创建学生对象(之前已经创建)
        Student s1=new Student("wangming",18);
        Student s2=new Student("wangfang",19);
        Student s3=new Student("liuming",17);
        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //打印结果
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+","+list.get(i).getAge());
        }
    }
}
