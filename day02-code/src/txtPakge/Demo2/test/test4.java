package txtPakge.Demo2.test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        /*需求:电影院卖了100张票,票的序号为1-100,其中基数票号坐左侧,偶数票号坐右侧
        键盘键入一份整数表示电影票号,根据不同的情况,给出不同的提示
        如果票号为基数,打印坐左边
        如果票号为偶数,打印坐右边
         */

        //1.输入票号
        Scanner sc=new Scanner(System.in);
        System.out.println("输入票号:(1-100)");
        int num=sc.nextInt();
        //2.if语句判断提示语句给出提示
        if(num>=0&&num<=100){
            if(num%2==0){
                System.out.println("坐右边");
            }else{
                System.out.println("坐左边");
            }
        }else{
            System.out.println("号码输入不正确");
        }

    }
}
