package txtPakge.Demo2.test;

import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        //需求:键盘录入一个数,表示范围,统计这个范围中
        //既能被3整除,又能被5整除的数

        //1.键盘录入
        int low=0,high=0;
        Scanner sc=new Scanner(System.in);
        for (int i=1;i!=0;){
            System.out.println("输入较小的整数数字:");
            low=sc.nextInt();
            System.out.println("输入较大整数的数字:");
            high=sc.nextInt();
            if(low<high) {
                i = 0;
            }else{
                i=1;
                System.out.println("格式不正确,请重新输入");
            }
        }
        //2.确定嵌套:for循环+条件运算/
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=(i%3==0&&i%5==0?1:0);
        }
        System.out.println(sum);
    }
}
