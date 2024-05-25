package txtPakge.Demo4.test;

import java.util.Scanner;
import java.util.StringJoiner;

public class symmetryWord {
    public static void main(String[] args) {
        //接收一个字符串,程序判断该字符串是否是对称字符串,并打印(类似回文数)


        //创建一个StrinBuiler类
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input=sc.next();
        StringBuilder symmetry=new StringBuilder(input);

        //引用类方法反转
        //转化为string类型在与原类型比较是否相同
        boolean rules=symmetry.reverse().toString().equals(input);
        System.out.println(rules==true?"是":"不是"+"对称字符串");
        System.out.println("------------------------------");


        //定义一个方法,把int数组中的数据按照指定格式拼接成一个字符串返回
        //调用该方法,并在控制台输出结果
        int[] arr={1,2,3,52,3,4};
        String result=connect(arr);
        System.out.println(result);
        System.out.println("-------------------------------");
        String result2=connect2();
        System.out.println(result2);
    }

    public static String connect(int[] arr){
        StringBuilder newstring=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            newstring.append(arr[i]);
        }
        return newstring.toString();
    }

    public static String connect2() {
        StringJoiner newstring=new StringJoiner(",","[","]");
        newstring.add("aaa").add("bbbb").add("ccc");
        return newstring.toString();
    }
}
