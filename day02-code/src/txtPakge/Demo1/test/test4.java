package txtPakge.Demo1.test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        /*需求:
        键盘输入两个整数表示两只老虎重量,判断两只
        老虎的体重是否相同
         */

        //1.键盘输入两个整数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一只老虎的重量:(整数kg)");
        int tiger1= sc.nextInt();
        System.out.println("请输入第二只老虎的重量:(整数kg)");
        int tiger2= sc.nextInt();
        //2.判断比较并输出结果
        System.out.println(tiger1==tiger2?"相同":"不同");
    }
}
