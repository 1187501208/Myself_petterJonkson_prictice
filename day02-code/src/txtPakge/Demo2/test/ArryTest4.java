package txtPakge.Demo2.test;

import java.util.Scanner;

public class ArryTest4 {
    public static void main(String[] args) {
        //定义一个数组,存储班级中50个学生姓名,姓名未知,等学生报道后,在进行添加


        //1.定义动态数组
        String arr[]=new String[50];
        //2.键盘录入结果
        Scanner SC=new Scanner(System.in);
        System.out.println("输入学生姓名:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= SC.next();
        }
        //3.打印结果
        System.out.println("学生姓名是:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
