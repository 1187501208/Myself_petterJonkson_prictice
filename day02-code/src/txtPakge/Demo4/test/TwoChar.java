package txtPakge.Demo4.test;

import java.util.Scanner;

public class TwoChar {
    public static void main(String[] args) {
        /*注意:需要用已有的知识完成。
        给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，
        它们的乘积也表示为字符串形式。
         */

        //设置num1和num2,把两个转化为数字,再将两个相乘,最后转化为字符串

        //设置字符,并检查字符串是否是非负数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串1:");
        String num1=sc.next();
        System.out.println("请输入字符串2:");
        String num2=sc.next();
        boolean temple=true;
        for (int i = 0; i < num1.length(); i++) {
            if(num1.charAt(i)>='0'&&num1.charAt(i)<='9'){
            }else {
                System.out.println("格式错误,请输入0-9的数字");
                temple=false;
                break;
            }
        }
        if(temple) {
            for (int i = 0; i < num2.length(); i++) {
                if (num2.charAt(i) >= '0' && num2.charAt(i) <= '9') {
                } else {
                    System.out.println("格式错误,请输入0-9的数字");
                    temple = false;
                    break;
                }
            }
        }
        //把两个字符相乘
        if(temple){
            //调用转化方法
            int getnum1=trans(num1);
            int getnum2=trans(num2);
            int sum=getnum1*getnum2;
            //得到结果
            System.out.println(sum);
        }

    }

    //转化字符串为数字
    public static int trans(String num){
        int number =0;
        int sum=0;
        for (int i = 0; i <num.length(); i++) {
            number =num.charAt(i)-48;
            sum= number+sum*10;
        }
        System.out.println(sum);
        return sum;
    }
}
