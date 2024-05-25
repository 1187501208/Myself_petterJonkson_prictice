package txtPakge.Demo1.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*
        需求:
        您和您的对象正在餐厅获取一张桌子.
        键盘录入两个整数.表示您和您约会对象衣服的时髦程度(手动录入0-10之间的整数
        如果您的时髦成都大于您对象的时髦程度,相亲就成功,输出true,否则输出false
         */

        //1.键盘输入两个整数表示衣服时髦程度
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入自己衣服时髦程度:(0-10之间)");
        int myFashion=sc.nextInt();
        System.out.println("请输入对象衣服时髦程度:(0-10之间)");
        int girlFashion=sc.nextInt();
        //2.把衣服时髦程度进行对比
        boolean result=myFashion>girlFashion;
        //3.打印结果
        System.out.println(result);
    }
}
