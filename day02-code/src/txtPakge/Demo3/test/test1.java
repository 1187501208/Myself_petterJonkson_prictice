package txtPakge.Demo3.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //需求:定义一个方法,求长方形的周长,将结果在方法中打印
        Scanner sc=new Scanner(System.in);
        System.out.println("输入长度:");
        double x=sc.nextDouble();
        System.out.println("输入宽度:");
        double y=sc.nextDouble();
        getLength(x,y);
    }
    //定义长方形方法
    public static void getLength(double len,double width){
        double result=(len+width)*2;
        System.out.println(result);
    }
}
