package txtPakge.Demo2;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //需求1:利用索引对数组里面的元素进行访问
        int[] arr1={1,2,3,4};
        System.out.println(arr1[3]);

        //需求2:把数据存储到数组当中
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        arr1[1]=input;
        System.out.println(arr1[1]);
    }
}