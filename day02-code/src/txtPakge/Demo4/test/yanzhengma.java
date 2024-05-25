package txtPakge.Demo4.test;

import java.util.Random;

public class yanzhengma {
    public static void main(String[] args) {
       /* 生成验证码
        内容:可以是小写字母，也可以是大写字母，还可以是数字
        规则:
        长度为5
        内容中是四位字母，1位数字。其中数字只有1位，但是可以出现在任意的位置。*/


        //两种思路:先生成所有需要的字符,再打乱/依次随机生成每一个字符
        //设置一个容器存放验证码
        //random随机确定数字,其他位置存放字母,用0/1随机数来确定是大写还是小写,最好将所有字符索引打乱随机
        //或者给数字和大小写字母设置标签,0/1/2,random到哪个标签就是哪个,如果已经出现了数字,则用true/false开关
        //将后面的结果直接用字母代替,字母的随机就用ASCII码表来确定
        //或者直接把大小写字母和数字放进一个数组/容器里面,随机生成时直接从里面取

        //设置容器
        StringBuilder sb=new StringBuilder();
        //生成数字随机数
        Random r=new Random();
        int number=r.nextInt(10);
        //确定数字的大小写顺序
        for (int i = 0; i < 4; i++) {
            sb.append(r.nextInt(2));
        }
        System.out.println("输出数字大小写序列");
        //大写为1,小写为0
        System.out.println(sb);
        System.out.println("-------------------------------------");
        //生成字母字符串
        StringBuilder charString=new StringBuilder();
        int index=0;
        char indexchar=' ';
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='1'){
                index=r.nextInt(26)+65;
                //把下标的数字强转为字符
                indexchar=(char)(index);
                System.out.println(indexchar);
                //把字符拼接
                charString.append(indexchar);
            }else {
                index=r.nextInt(26)+97;
                indexchar=(char)(index);
                charString.append(indexchar);
                System.out.println(indexchar);
            }
        }
        char[] result=charString.append(number).toString().toCharArray();
        System.out.println(result);
        //把字符串用replace方法,依次随机调换
        char tuple=0;
        for (int i = 0; i < result.length; i++) {
            index=r.nextInt(5);
            tuple=result[index];
            result[index]=result[i];
            result[i]=tuple;
        }
        String end=new String(result);
        System.out.println("-------------------------------------");
        System.out.println(end);
    }
}
