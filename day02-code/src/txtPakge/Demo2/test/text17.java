package txtPakge.Demo2.test;

import java.util.Scanner;

public class text17 {
    public static void main(String[] args) {
        //需求:给定两个数,被除数和除数(都是正数,且不超过int范围)
        //将两数相除,要求不适用乘法,除法,和%运算符,得到商和余数


        //基础解法:利用除法的根本性质,从0依次算出除数的倍数(用加法代替乘法),找到离被除数最近且不超过该数的倍数
        //,该数字就是商,余下的就是余数

        //1.键盘录入数字
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入被除数:(正数)");
        int beichu=sc.nextInt();
        System.out.println("请输入除数:(正数且不能为0)");
        int chushu=sc.nextInt();

        //2.用循环找出商
        //初始化商和余数,以及商和除数的乘积temp
        int shang=0;
        int yushu=0;
        int temp=0;
        //比较商乘除数来决定余数
        while (temp<=beichu){
            shang++;
            temp+=chushu;
        }
        shang-=1;

        //3.计算余数(为了节省空间,不需要计算每一次循环的余数,找到商才计算余数)
            yushu=beichu-(temp-chushu);

        //4.打印商和余数
        System.out.println("商:"+shang+"\t"+"余数:"+yushu);
    }
}
