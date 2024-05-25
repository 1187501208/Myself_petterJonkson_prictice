package txtPakge.Demo2.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /*需求:在超市购买物品时,商品总价为600元,
        键盘输入一个整数表示用户实际支付的钱
        如果付款大于600,表示付款成功,否则显示失败
         */

        //1.定义商品价格
        int product = 600;
        //2.录入支付的钱数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入支付钱数:(整数)");
        int give = sc.nextInt();
        //3.if语句判断支付是否成功
        if (give >= product) {
            System.out.println("支付成功!");
        } else {
            System.out.println("支付失败!");
        }
    }
}
