package txtPakge.Demo2.test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //需求:键盘录入星期数,显示今天是减肥运动
        //周一:跑步
        //周二:慢走
        //周三:游泳
        //周四:动感单车
        //周五:拳击
        //周六:爬山
        //周日:好好吃一顿


        //1.输入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数:");
        int input = sc.nextInt();
        //2.拿这个面和其他相匹配
        switch (input) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("慢走");
                break;
            case 3:
                System.out.println("游泳");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
            default:
                System.out.println("输入格式不正确");
                break;
        }
    }
}
