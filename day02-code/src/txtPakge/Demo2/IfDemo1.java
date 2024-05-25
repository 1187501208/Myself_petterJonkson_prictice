package txtPakge.Demo2;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //需求:键盘录入女婿酒量,大于2斤,老丈人给出回应,反之不回应

        //1.录入酒量
        Scanner sc=new Scanner(System.in);
        System.out.println("输入酒量(L):");
        double drunk=sc.nextDouble();
        //2.If语句判断回应(只有一个单独的执行语句体时也可以不写大括号,包含多个运算的不算单独)
        //例如 int a=100;算是两句执行语句
        if(drunk>2){
            System.out.println("小伙子,不错!!");
        }
    }
}
