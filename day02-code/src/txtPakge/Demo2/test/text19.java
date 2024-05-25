package txtPakge.Demo2.test;

import java.util.Scanner;

public class text19 {
    public static void main(String[] args) {
        //需求:键盘录入一个大于等于2的整数x,计算返回x的平方根
        //结果只保留整数部分,小数部分将被舍去

        //基础解法:从1*1开始计算,在1与x之间取一个中间整数,该数字记为middle,
        //如果middle*middle>x则该数在1-middle之间,如果middle*middle<x,则该数在middle-x之间,
        //把二分的最小值记为low,最大值记为x,依次二分下去,直到该数字在两个相邻整数之间.
        //用二分法而不采用从1-x依次求平方与x比较的原因是 1.二分法效率高 2.二分法可以找到最接近的整数

        //1.键盘录入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:(大于等于2的整数)");
        int input = sc.nextInt();
        int x=input;

        //2.while循环依次找中间数middle,再用if判定middle-x是否为1;
        int low=0;
        int middle=0;
        while (x-low>1){
            middle=(x-low)/2+low;
            if(middle*middle<=input){
                low=middle;
            }else{
                x=middle;
            }
        }
        System.out.println(input+"的整数平方根是"+low);
    }
}