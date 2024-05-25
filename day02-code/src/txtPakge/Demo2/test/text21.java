package txtPakge.Demo2.test;

import java.util.Scanner;

public class text21 {
    public static void main(String[] args) {
        //需求:键盘录入一个正整数,判断该整数是否为一个质数
        //质数:如果一个整数只能被1和本身整除,那么这个数就是质数,否则这个数叫合数

        //基础解法:从1到这个数,依次找到一个数,能被这个数整除,那么这个数就不是质数
        //一直循环到这个数-1,那么这个数就是质数

        //平方根解法:一个数能否被分解,那么他的两个分解的数字一定分布在他的平方根两侧,
        //这样就可以从1-该数的平方根范围内找,节省时间

        //1.键盘录入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:(正整数)");
        int input = sc.nextInt();
        //调用math函数求平方根(向下取整)
        int x= (int) Math.sqrt(input);
        System.out.println("平方根为:"+x);

        //2.while循环依次递增找数,在接近原数字时停止
        //这里使用了flag布尔数来作为判定牌,有情况不是就修改,没有就不修改,
        //最后根据判定牌来决定输出语句
        boolean flag=true;
        int i=1;
        for(;i<x;i++){
            if(input%i==0&&i!=1){
                flag=false;
                System.out.println("因式分解为:"+i+"*"+input/i);
                break;
            }
        }
        if (flag){
            System.out.println("是质数");
            System.out.println("循环了"+i+"次");
        }else{
            System.out.println("不是质数");
            System.out.println("循环了"+i+"次");
        }
    }
}