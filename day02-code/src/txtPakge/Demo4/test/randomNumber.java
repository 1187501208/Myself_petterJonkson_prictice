package txtPakge.Demo4.test;

import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args) {
        //键盘输入任意字符串,打乱里面的内容
        //录入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input=sc.next();
        //调用方法,打乱字符串
        String result=getrandom(input);
        //输出结果
        System.out.println("打乱后的字符串是:"+result);
    }

    //打乱字符串的方法
    //或者用toStringArray方法把字符串变成数组,依次把数组的每一个字符与随机一个索引代表的字符交换,再拼接成字符串
    public static String getrandom(String input){
        //创建一个StringBuilder容器
        StringBuilder sb=new StringBuilder(input.length());
        Random r=new Random();
        String result="";
        //把索引放进容器
        for (int i = 0; i < input.length(); i++) {
            sb.append(i);
        }
        System.out.println(sb);
        //遍历字符串,每次随机取一个字符,拼接到容器里面
        while (sb.length()!=0) {
            //随机取一个下标数组的索引
            System.out.println(sb.length());
            int index=r.nextInt(sb.length());
            //取出该索引代表的下标容器里面的下标,并找到该下标对应的字符拼接到容器里面
            result+=input.charAt(sb.charAt(index)-48);
            //删除已经取出的字符
            sb.deleteCharAt(index);
            System.out.println(sb);
        }
        //返回打乱后的字符串
        return result;
    }
}
