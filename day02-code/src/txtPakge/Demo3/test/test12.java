package txtPakge.Demo3.test;

import java.util.Random;

public class test12 {
    public static void main(String[] args) {
        //需求:定义方法实现随机产生一个5位验证码
        //验证码格式:长度位5,前四位是大学字母或者小写字母,最后一位是数字

        /*方法:如果需要在一堆无明显规律的数据中随机抽取,
        可以先把这些数据放到数组当中,再随机抽取一个索引
         */


        //1.创建数组
        char arr[] = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                arr[i] = (char) (65+ i);
            } else {
                //特别注意:这里i增加已经超过26了,需要减去,才相当于从0开始计算
                arr[i] = (char) (97 + i-26);
            }
        }
        //作为返回值用的数组
        char arr2[]=new char[4];

        //3.调用字母随机数的方法
        getRandomNumber(arr,arr2);

        //3.找到最后一个数字随机数
        Random r=new Random();
        //这里不能把arr2[]设置为5个长度,把随机数字强行转化为字符加在后面,会报错为符号.
        //因此只能选择单独输出或者把数组换成字符串,可以直接加后面
        //char lastNumber=r.nextInt(10);
        //arr2[arr2.length-1]=lastNumber;

        //4.输出结果
        System.out.println("验证码是:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

    //2.定义随机抽取方法
    public static void getRandomNumber(char[] arr,char[] arr2) {
        Random r=new Random();
        for (int i = 0; i < arr2.length-1; i++) {
            int randomIndex=r.nextInt(arr.length-1);
            arr2[i] = arr[randomIndex];
        }
    }
}

