package txtPakge.Demo3.test;

import java.util.Random;

public class test13 {
    public static void main(String[] args) {
        //需求:定义方法实现随机产生一个5位验证码
        //验证码格式:长度位5,前四位是大学字母或者小写字母,最后一位是数字

        /*方法:如果需要在一堆无明显规律的数据中随机抽取,
        可以先把这些数据放到数组当中,再随机抽取一个索引
        然后再把这些字符加上数字都放进一个字符串当中.
         */


        //1.创建数组
        char arr[] = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                //大写A开始26个字母
                arr[i] = (char) (65+ i);
            } else {
                //小写a开始26个字母
                //特别注意:这里i增加已经超过26了,需要减去,才相当于从0开始计算
                arr[i] = (char) (97 + i-26);
            }
        }

        //3.调用字母随机数的方法
        String result=getRandomNumber(arr);

        //4.输出结果
        System.out.println(result);
    }

    //2.定义随机抽取方法
    public static String getRandomNumber(char[] arr) {
        //定义一个字符串来记录最终结果
        String result="";
        //把每个随机字符的索引找到,把对应字符放进字符串
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex=r.nextInt(arr.length-1);
             result+=arr[randomIndex];
        }
        //加上最后一个随机数字
        int lastNumber=r.nextInt(10);
        result+=lastNumber;
        return result;
    }
}

//相比之前那种方法,直接输出字符串虽然看上去更简单,但是灵活性不强,比如
//无法在每个单独的字符之间写出空格等.

