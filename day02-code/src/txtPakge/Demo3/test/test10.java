package txtPakge.Demo3.test;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        //需求:机票价格按照淡季旺季,头等舱和经济舱收费,
        //输入机票原价/月份/头等舱或者经济舱,按照如下规则计算票价:
        //旺季(5-10月)头等舱9折,经济舱8.5折,淡季(11到来年4月),头等舱7折,经济舱6.5折


        //1.键盘录入数据
        //调用录入方法
        int[] input=new int[2];
        getInput(input);
        //3.调用票价计算方法
        double price;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入购买票的原价:");
        price=sc.nextDouble();
        price=getPrice(price,input);

        //5.显示票价
        System.out.println(price);
    }
    //2.定义一个录入方法
    public static void getInput(int[] input) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份:");
        int month=sc.nextInt();
        //这种两种情况的,也可以用true和false来作为判断
        System.out.println("头等舱输入1,经济舱输入2:");
        int fly=sc.nextInt();
        if(fly!=1&&fly!=2){
            System.out.println("输入格式不正确,请重新输入:");
            fly=sc.nextInt();
        }
        //因为是引用数据类型,数据存在堆当中,所以方法执行结束后数据依然存在
        //且能被其它方法共享
        input[0]=month;
        input[1]=fly;
    }

    //4.定义票价计算方法
    public static double getPrice(double price,int[] input){
        //旺季价格计算(5-10月)
        if(input[0]>=5&&input[0]<=10){
            switch (input[1]){
                case 1:
                    price=price*0.9;
                    break;
                case 2:
                    price=price*0.85;
                    break;
                default:
                    System.out.println("error");
            }
        }
        //淡季价格计算
        else {
            switch (input[1]){
                case 1:
                    price=price*0.7;
                    break;
                case 2:
                    price=price*0.65;
                    break;
                default:
                    System.out.println("error");
            }
        }
        return price;
    }

}
