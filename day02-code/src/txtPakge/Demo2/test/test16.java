package txtPakge.Demo2.test;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        //需求:给一个整数x,如果x是一个回文整数,打印true,
        //返回false,回文数:正序(从左到右)和倒序(从右到左)读都一样的整数,
        //例如:121

        //利用回文数性质解法:利用回文数性质,回文数的倒数和原来数字一样
        //1.键盘录入整数
        Scanner sc=new Scanner(System.in);
        System.out.println("输入数字");
        int input=sc.nextInt();
        //temp表示临时存储数字
        int temp=input;

        //2.用循环写出输入数字的倒数,只知道需要循环或者循环结束条件,不考虑次数用while
        int back_number=0;
        while (temp!=0){
            int ge=temp%10;
            temp/=10;
            back_number=back_number*10+ge;
        }

        //3.把原数和倒数相比较,因为case后面的值只能是常量,所以不能用switch语句
        if(back_number==input){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }

    }
}
