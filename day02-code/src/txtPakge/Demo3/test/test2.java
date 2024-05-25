package txtPakge.Demo3.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //需求:定义一个方法,求圆的面积,将结果在方法中打印
        Scanner sc=new Scanner(System.in);
        System.out.print("输入圆的半径:");
        double r=sc.nextDouble();
        getsquar(r);
    }
    //定义长方形方法
    public static void getsquar(double rand){
        double result=rand*rand*3.14;
        System.out.println(result);
    }
}
