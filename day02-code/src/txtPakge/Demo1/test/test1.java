package txtPakge.Demo1.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数,并输出个位数字

        //1.键盘输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number=sc.nextInt();
        //2.获取各位数字
        //个位:数字%10
        //十位:数字/10%10
        //百位:数字/10/10%10
        int ge=number%10;
        int shi=number/10%10;
        int bai=number/100%10;
        /*在制表符前面是string类型时可以用单引号,但是如果前面是非string类型,
        就会自动把制表符识别为ASCII码里面的对应整数9与前面的数字相加,因此建议转义字符用双引号*/
        System.out.println("个位:"+ge+"\t"+"十位:"+shi+"\t"+"百位:"+bai);
    }
}
