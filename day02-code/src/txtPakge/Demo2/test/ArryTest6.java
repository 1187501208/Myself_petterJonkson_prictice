package txtPakge.Demo2.test;

import java.util.Random;

public class ArryTest6 {
    public static void main(String[] args) {
        //需求:生成10个1-100之间的随机数存入数字
        //求出所有数据的和
        //求出所有数据的平均值
        //统计又多少个数据比平均值小


        //1.生成随机数,并存入数组里面
        //生成动态数组和随机数
        int[] arr=new int[10];
        Random r=new Random();
        //把每次生成的随机数存入数组里面
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(100)+1;
        }
        //打印随机数
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //2.求和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("数据之和为:"+sum);

        //3.求平均数
        double avr=0;
        avr=sum/arr.length;
        System.out.println("平均数为:"+avr);

        //4.统计数据比平均数小的又多少个
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avr){
                count++;
            }
        }
        System.out.println("比平均数小的有:"+count+"个");
    }
}
