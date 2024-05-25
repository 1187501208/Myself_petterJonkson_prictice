package txtPakge.Demo4.test;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        //键盘录入一个字符串,统计该字符串的大小写字母,数字出现的次数

        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input=sc.next();

        //用字符串方法提取每个字符索引
        int countBig=0;
        int countSmall=0;
        int countNum=0;
        System.out.println("字符如下:");
        for (int i = 0; i < input.length(); i++) {
            char temple=input.charAt(i);
            if(temple>='a'&&temple<='z'){
                countSmall++;
            } else if (temple >= 'A' && temple <= 'Z') {
                countBig++;
                //注意数字加单引号,表示字符而不是ASCII码
            } else if (temple >= '0' && temple <= '9') {
                countNum++;
            }else {
                System.out.printf("%s是非法字符",temple);
                System.out.println();
            }
        }

        //统计次数并输出
        System.out.printf("大写字母有%s个\n",countBig);
        System.out.printf("小写字母有%s个\n",countSmall);
        System.out.printf("数字有%s个\n",countNum);
    }
}
