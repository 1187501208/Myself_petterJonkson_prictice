package txtPakge.Demo2.test;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        /*需求:键盘录入数字,表示按键选择不同服务
        1机票查询2机票预定3机票改签4退出服务,
        其他按键也是推出服务,用switch模拟
         */


        //1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请按键选择功能:");
        int input=sc.nextInt();
        //2.选择比较
        switch(input){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
