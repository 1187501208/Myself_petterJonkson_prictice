package txtPakge.Demo3.test;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        //需求:把一个数组中的元素赋值到另一个新数组中去

        //方法:把输入字符串放进数组,再找到数组的长度,建立一个新的
        //数组,把对应数组索引找到,并进行复制
        
        
        //1.输入字符串(不能含有空格,输入字符数组时会自动停止)
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //定义原数组
        char[] arr=new char[str.length()];
        int count=0;
        
        //3.调用把字符串放进数组的方法
        count=getStrToArr(count, str, arr);

        //输出字符串数组
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*/

        //5.调用把字符串放进数组的方法
        //定义复制数组
        char[] arr2=new char[arr.length];
        copyArr(arr, arr2);

        //6.输出数组
        System.out.println("复制后的数组是:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

    //2.把字符串放进数组
    private static void copyArr(char[] arr, char[] arr2) {
        for(int i = 0; i< arr.length; i++){
            arr2[i]= arr[i];
        }
    }

    //4.复制数组
    private static int getStrToArr(int count, String str, char[] arr) {
        for(; count < str.length();){
            arr[count]= str.charAt(count);
            count++;
        }
        return count;
    }
}
