package txtPakge.Demo2.test;

import java.util.Random;
import java.util.Scanner;

public class text22 {
    public static void main(String[] args) {
        //需求:生成一个随机数在1-100之间,并且用程序猜到这个数字


        //1.生成这个数字1-100之间(100-1+1=100)
        Random r=new Random();
        //bound生成的数范围是从0开始,到这个数-1结束(bound是非输入字符)
        //生成任意数:头尾都加一个值从任意开始端开始,再把这两个数做差求范围+1
        int number=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int count=0;
        do {
            //输入数字
            System.out.println("请输入这个数字:");
            int guessNumber=sc.nextInt();
            //建立保底机制,第五次没猜中就直接提示猜中了
            if(count==5){
                System.out.println("猜中了");
                break;
            }
            //分类
            if (number < guessNumber) {
                System.out.println("偏大");
                count++;
            } else if (number > guessNumber) {
                System.out.println("偏小");
                count++;
            } else {
                System.out.println("猜对了!");
                break;
            }
        }while (true);
    }
}