package txtPakge.Demo3.test;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        //某系统的数字密码(大于0),比如1983,采用加密方法进行传输
        //规则如下:先得到每位数,然后每位数都加上5,再对10求余,
        //最后将所有数字反转,得到一串新数


        //解法:把密码放进数组,然后再把新密码转换的每个功能做成一个
        //方法,提高功能的修改性,最后调用得到新数字

        //1.定义输入的密码,并存入数组
        //把输入值存入字符串,再把字符串切片放进数组里面
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[] passcode=new int[str.length()];

        //2.调用输入字符并存入数组的功能方法
        System.out.println("存入数组后:");
        inputArr(passcode, str);

        //4.调用每位数都加5的方法
        System.out.println("加5后:");
        pluseNumber(passcode);

        //5.调用对10求余方法
        System.out.println("求余后:");
        getLest(passcode);

        //7.调用把所有数字反转的方法
        System.out.println("反转后:");
        returnNumber(passcode);

        //9.打印密码加密的结果
        System.out.println("密码加密后的结果是:");
        for (int i = 0; i < passcode.length; i++) {
            System.out.print(passcode[i]+" ");
        }
    }

    private static void pluseNumber(int[] passcode) {
        for (int i = 0; i < passcode.length; i++) {
            passcode[i]+=5;
            System.out.print(passcode[i]);
        }
        System.out.println(" ");
    }

    //6.求余方法
    private static void getLest(int[] passcode) {
        for (int i = 0; i < passcode.length; i++) {
            passcode[i]%=10;
            System.out.print(passcode[i]);
        }
        System.out.println(" ");
    }

    //8.求反转方法
    private static void returnNumber(int[] passcode) {
        int backNumber;
        for (int i = 0, j = passcode.length-1; i < j; i++,j--) {
            backNumber= passcode[i];
            passcode[i]= passcode[j];
            passcode[j]=backNumber;
        }
        System.out.println("同结果");
    }

    //3.字符串放进数组的方法
    private static void inputArr(int[] passcode, String str) {
        //字符串切片函数是:字符串名.charat(索引);
        test20.getStrToArr(passcode, str);
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