package txtPakge.Demo4.test;

import java.util.Scanner;
import java.util.StringJoiner;

public class romma {
    public static void main(String[] args) {
        /*键盘录入一个字符串要求1:长度为小于等于9
        要求2:只能是数字
        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系
        I-1、II-2、III-3、IV-4、V-5、Ⅵ-6、-VII7、VIII-8、|X-9
        注意点:罗马数字里面是没有0的如果键盘录入的数字包含0，可以变""(长度为0的字符串)
         */


        //录入字符串,并检查是否满足规则
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input=sc.next();
        for (int i = 0; i < input.length(); i++) {
            if(input.length()<=9&&input.charAt(i)>'0'&&input.charAt(i)<'9'){
            } else if (input.charAt(i) == '0') {
                System.out.println("格式不正确,包含0数字");
                input="";
                break;
            } else {
                System.out.println("输入格式不正确,请重新输入长度小于9的字符串数字):");
                input=sc.next();
                i=0;
            }
        }

        //设置一个方法,里面的数组存放罗马数字,通过索引引用
        String getRommaNumber=numToromma(input);

        //输出返回值
        if(getRommaNumber.equals("[]")){
            getRommaNumber="";
        }else {
            System.out.println("-----------------------------");
            System.out.println("罗马数字是:");
            System.out.println(getRommaNumber);
        }

    }

    //罗马字符转化方法
    public static String numToromma(String getnum){
        String[] romma={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String result="";
        StringJoiner sj=new StringJoiner("-","[","]");
        for (int i = 0; i < getnum.length(); i++) {
            int number=(int) getnum.charAt(i)-48;
            sj.add(romma[number]);
        }
        return sj.toString();
    }

}
