package txtPakge.Demo2.test;

import java.util.Random;

public class ArryTest9 {
    public static void main(String[] args) {
        //需求:定义一个数组,存入1,2,3,4,5.要求打乱数组中所有数据的顺序


        //1.定义数组
        int[] arr={1,2,3,4,5};

        //2.打乱顺序
        int temp, j;
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            temp=arr[i];
            int randomIndex=r.nextInt(arr.length);
            j=randomIndex;
            arr[i]=arr[j];
            arr[j]=temp;
        }

        //3.打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
