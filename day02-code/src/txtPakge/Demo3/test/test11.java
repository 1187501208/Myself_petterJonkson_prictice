package txtPakge.Demo3.test;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        //需求:判断101⁓200之间有多少个素数,并输出所有的素数

        //1.创建方法
        //键盘录入范围
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要寻找数字的开始值:(大于等于2)");
        int begining=sc.nextInt();
        System.out.println("请输入需要寻找数字的结束值:");
        int ending=sc.nextInt();

        //定义一个数组容纳这些素数
        int[] arr=new int[ending-begining+1];
        //调用判断方法
        getPrimeNumber(begining,ending,arr);

        //输出素数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }

    //2.定义素数判断方法
    public static void getPrimeNumber(int begining,int ending,int[] arr) {
        int count=0;
        //寻找素数
        int i=begining;
        //i表示从开始到结束的每一个数字
        while (i<=ending){
            int j=2;
            //j代表每个数从2到他本身之间的所有数字是否存在他的因数
            while (j<=i){
                if(i%j!=0&&j<i-1){
                    j++;
                }else if(j==i-1){
                    arr[count]=i;
                    count++;
                    i++;
                    break;
                }else{
                    i++;
                    break;
                }
            }
            if(j>i){
                System.out.println("格式错误:");
                break;
            }
        }
    }
}
