package txtPakge.Demo1.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /*需求:
        键盘输入两个整数,如果其中一个为6,最终结果输出true,
        如果他们之和为6的倍数,最终结果也输出true,其他情况都是false
         */

        //1.键盘输入两个整数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a=sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b= sc.nextInt();
        //2.判断是否满足条件
        boolean c=a==6||b==6||(a+b)%6==0;
        //3.输出结果和两个整数的值
        System.out.println(c);
        System.out.println("a="+a+"\t"+"b="+b);
    }
}
