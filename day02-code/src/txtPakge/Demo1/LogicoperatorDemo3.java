package txtPakge.Demo1;

import java.util.Scanner;

public class LogicoperatorDemo3 {
    //三元运算
    public static void main(String[] args) {
        //1.获取较大数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int a=sc.nextInt();
        System.out.println("请输入第二个数:");
        int b=sc.nextInt();
        System.out.println("较大数是:"+(a>b?a:b));
    }
}
