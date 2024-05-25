package txtPakge.Demo4.test;

import java.util.Scanner;

public class turnback {
    public static void main(String[] args) {
        //定义一个字符串,实习字符串反转,键盘录入一个字符串,调用该方法后,在控制台输出结果

        //键盘录入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input=sc.next();

        //调用字符串反转方法
        String rules = turnback(input);

        //打印结果
        System.out.println("反转结果是:"+rules);
    }


    public static String turnback(String input){
        String backword="";
        for (int i = input.length()-1; i >= 0; i--) {
            char turple;
            turple=input.charAt(i);
            backword=backword+turple;
        }
        return backword;
    }
}
