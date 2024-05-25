package txtPakge.Demo3.test;

import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        //某系统的数字密码(大于0),比如1983,采用加密方法进行传输
        //规则如下:先得到每位数,然后每位数都加上5,再对10求余,
        //最后将所有数字反转,得到一串新数
        //现在进行解密


        //解法:把加密的功能反过来

        //1.定义输入的密码,并存入数组
        //把输入值存入字符串,再把字符串切片放进数组里面
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[] passcode=new int[str.length()];

        //2.调用输入字符并存入数组的功能方法
        System.out.println("存入数组后:");
        inputArr(passcode, str);
        System.out.println(" ");

        //4.调用把所有数字反转的方法
        System.out.println("部分反转后:");
        returnNumber(passcode);
        System.out.println(" ");

        //5.调用对10反求余方法
        // (这里有个技巧,因为求余前的数字介于5-14之间,如果求余前是大于等于10的数字
        //那么求余后一定在0-4之间,如果是小于10,那么结果一定在5-9之间)
        System.out.println("反求余后:");
        getLest(passcode);
        System.out.println(" ");

        //7.调用每位数都减5的方法
        System.out.println("减5后:");
        pluseNumber(passcode);
        System.out.println(" ");


        //9.打印密码加密的结果
        System.out.println("密码加密后的结果是:");
        for (int i = 0; i < passcode.length; i++) {
            System.out.print(passcode[i]+" ");
        }
    }


    //8.把结果减5
    private static void pluseNumber(int[] passcode) {
        for (int i = 0; i < passcode.length; i++) {
            passcode[i]-=5;
            System.out.print(passcode[i]);
        }
    }

    //6.反求余方法
    private static void getLest(int[] passcode) {
        for (int i = 0; i < passcode.length; i++) {
            if(passcode[i]<5){
                passcode[i]+=10;
                System.out.print(passcode[i]);
            }
        }
    }

    //8.求反转方法
    private static void returnNumber(int[] passcode) {
        int backNumber;
        for (int i = 0, j = passcode.length-1; i < j; i++,j--) {
            backNumber= passcode[i];
            passcode[i]= passcode[j];
            passcode[j]=backNumber;
            System.out.print(passcode[i]);
        }
    }

    //3.字符串放进数组的方法
    private static void inputArr(int[] passcode, String str) {
        //字符串切片函数是:字符串名.charat(索引);
        for (int i = 0; i < passcode.length; i++) {
            //把字符串切片,再把每一个字符类型
            // 用String.valueOf(字符)这个函数把字符(数字)变成字符串类型,用
            //Integer.parseInt(字符串)函数,把字符串类型变成整型数字类型
            //把结果再复制给原整型数组(字符类型没办法直接转成数字,只能先转成字符串类型)
            char temp1= str.charAt(i);
            String temp2 =String.valueOf(temp1);
            passcode[i]=Integer.parseInt(temp2);
            System.out.print(passcode[i]);
        }
    }
}
/*
字符或者数字转字符串:
		char ch = '5';
		String str = ch + "";
		System.out.println(str);

		int number = 5;
		String str = number + "";
		System.out.println(str);

数字转字符:(数字跟字符都不能直接转,也要把字符转为字符串,再调用切片函数xxx.chartAt(i)
来进行获取.
		int number = 5; //注意这里数字只能是个位数并且不能为负
		String temp = Integer.toString(number);
 */