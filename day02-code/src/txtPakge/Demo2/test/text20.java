package txtPakge.Demo2.test;

import java.util.Scanner;

public class text20 {
    public static void main(String[] args) {
        //需求:键盘录入一个正整数,判断该整数是否为一个质数
        //质数:如果一个整数只能被1和本身整除,那么这个数就是质数,否则这个数叫合数

        //基础解法:从1到这个数,依次找到一个数,能被这个数整除,那么这个数就不是质数
        //一直循环到这个数-1,那么这个数就是质数

        //1.键盘录入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:(正整数)");
        int input = sc.nextInt();
        int x=input;

        //2.while循环依次递增找数,在接近原数字时停止
        int i=1;
        for(;i<x;i++){
            if(x%i==0&&i!=1){
                System.out.println("不是质数");
                break;
            }
        }
        if (i==x){
            System.out.println("是质数");
        }
    }
}