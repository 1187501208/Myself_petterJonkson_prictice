package txtPakge.Demo2;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        //需求:键盘录入一个整数,表示身上的钱,如果大于等于100,吃网红餐厅
        //否则,吃沙县小吃

        //1.录入钱数
        Scanner sc=new Scanner(System.in);
        System.out.println("输入钱数(整数):");
        int money=sc.nextInt();
        //2.If语句判断回应(只有一个单独的执行语句体时也可以不写大括号,包含多个运算的不算单独)
        //例如 int a=100;算是两句执行语句
        if(money>=100){
            System.out.println("吃网红餐厅");
        }else {
            System.out.println("吃沙县小吃");
        }
    }
}
