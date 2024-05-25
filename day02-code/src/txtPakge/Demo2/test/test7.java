package txtPakge.Demo2.test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        /*需求:键盘录入星期数,输出工作日和休息日,
        (1-5)工作日,(6-7)休息日
         */


        //1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入星期数:(1-5)");
        int input=sc.nextInt();
        //2.选择比较
        if(input>=1&&input<=7){
            if(input<=5){
                System.out.println("工作日");
            }else {
                System.out.println("休息日");
            }
        }else {
            System.out.println("输入格式不正确:请输入1-7");
        }
    }
}
