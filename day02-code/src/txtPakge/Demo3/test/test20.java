package txtPakge.Demo3.test;

import java.util.Random;
import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        //需求:生成一个双色球系统(输入号码判断奖励)
        /*规则:投注号码有6个红色球号码和1个蓝色球号码组成.
         (红色球号码从1-33中选择;蓝色球号码从1-16中选择)(这一条暂时不考虑,每一位都假设是0-9之间):
         一等奖:猜中6个红球+1个蓝球
         二等奖:猜中6个红球+0个蓝球
         三等奖:猜中5个红球+1个蓝球
         四等奖:猜中5个红球+0个蓝球/4个红球+1个蓝球
         五等奖:猜中4个红球+0个蓝球/3个红球+1个蓝球/2个红球+1个蓝球
         六等奖:猜中1个红球+1个蓝球/0个红球+1个蓝球
         */

        //解法:把规则对应奖励放入case判断语句,把输入号码放进数组
        //调用对应判断语句来判定是否中奖


        //1.输入号码到数组
        Scanner sc = new Scanner(System.in);
        int[] getNumber = new int[7];
        System.out.println("请输入猜奖号码:");
        String str=sc.next();

        //2.调用字符串放进数组的方法
        inputArr(getNumber, str);

        //5.随机生成当期获奖号码
        //调用获取获奖号码的方法
        int[] priceNumber=new int[7];
        getPriceNumber(priceNumber);

        //7.创建获奖等级判断方法
        //调用获奖等级方法
        char level=getPrice(getNumber, priceNumber);

        //10.输出结果
        if(level==0){
            System.out.println("未中奖");
        }else {
            System.out.println(STR."中了\{level}等奖");
        }
    }

    //3.字符串放进数组的方法
    private static void inputArr(int[] passcode, String str) {
        //字符串切片函数是:字符串名.charat(索引);
        getStrToArr(passcode, str);
    }

    //4.字符串切片进数组的方法
    static void getStrToArr(int[] passcode, String str) {
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
        System.out.println(" \n");
    }

    //6.获取随机中奖号码方法
    public static void getPriceNumber(int[] arr) {
        Random r = new Random();
        int priceNumber = r.nextInt(8999999)+1000000;
        int temp=priceNumber;
        //System.out.println(temp);
        for(int i=6;temp!=0;i--) {
            arr[i]=temp%10;
            temp=temp/10;
        }
        arr[6]=0;
        System.out.println("中奖号码是:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");
    }

    //8.获取奖品等级方法
    public static char getPrice(int[] arr, int[] priceNumber) {
    //分成红球号码部分:redNumber和蓝球号码部分:blueNumber
        int[] redNumber = new int[6];
        for (int i = 0; i < arr.length - 1; i++) {
            redNumber[i] = arr[i];
        }
        //System.out.println(arr.length);
        //判断蓝球被猜中数getBlueNumber
        int blueNumber = arr[arr.length - 1];
        int getBlueNumber=0;
        if(blueNumber==priceNumber[6]){
            getBlueNumber=1;
        }
        System.out.print("\ncount getBlueNumber:"+getBlueNumber+'\n');
        //调用判断红球猜中数getRedNumber方法
        int getRedNumber=getRedNumber(redNumber,priceNumber);
        //根据红球猜中数getRedNumber和蓝球猜中数getBlueNumber来判断获奖等级
        // (这里也可以用逻辑运算||和&&来直接判断所有条件)
        char Price=0;
        switch (getRedNumber) {
            case 0, 1:
                if (getBlueNumber == 1) {
                    Price = '六';
                    break;
                }
                break;
            case 2:
                if (getBlueNumber == 1) {
                    Price = '五';
                    break;
                }
            case 3:
                if (getBlueNumber == 1) {
                    Price = '五';
                    break;
                }
            case 4:
                if (getBlueNumber == 0) {
                    Price = '五';
                    break;
                } else if (getBlueNumber == 1) {
                    Price = '四';
                    break;
                }
            case 5:
                if (getBlueNumber == 0) {
                    Price = '四';
                    break;
                } else if (getBlueNumber == 1) {
                    Price = '三';
                    break;
                }
            case 6:
                if (getBlueNumber == 0) {
                    Price = '二';
                    break;
                } else if (getBlueNumber == 1) {
                    Price = '一';
                    break;
                }
            default:
                Price=0;
                break;
        }
        return Price;
    }

    //9.获取红球被猜中数量方法
    public static int getRedNumber(int arr[],int priceNumber[]) {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==priceNumber[i]){
                count++;
            }
        }
        System.out.print("count getredNumber:"+count+'\n');
        return count;
    }
}


