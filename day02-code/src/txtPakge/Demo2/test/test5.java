package txtPakge.Demo2.test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        /*需求:根据不同的分数送不同的礼物
        如果是95-100分,送自行车一辆
        如果是90-94分,游乐场玩一天
        如果是80-89,送变形金刚一个
        如果是80分,挨揍*/

        //1.输入分数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分数:");
        int num = sc.nextInt();
        //2.if语句判断提示语句给出提示
        if(num>=0&&num<=100){
            if (num >= 95 && num <= 100) {
                System.out.println("送自行车一辆");
            } else if (num >= 90) {
                System.out.println("游乐场玩一天");
            } else if (num >= 80) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("挨揍!");
            }
        }else{
            System.out.println("当前录入的成绩不合法");
        }

    }
}
