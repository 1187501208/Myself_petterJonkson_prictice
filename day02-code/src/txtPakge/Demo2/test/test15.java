package txtPakge.Demo2.test;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        //需求:给一个整数x,如果x是一个回文整数,打印true,
        //返回false,回文数:正序(从左到右)和倒序(从右到左)读都一样的整数,
        //例如:121


        //基础解法:利用回文数定义,依次对比首个数和尾数的数字是否一样
        //把每一次数字的首数和尾数分别记录下来,然后对比,然后更新数字
        //更新数字是把每一次首位对比后的头尾数字去掉得到新的数字
        //例如12321,第一次对比1和1,然后去掉1,得到232,第二次对比2和2,然后去掉2,得到3,最后对比3和3,结束
        //1.键盘录入整数
        Scanner sc=new Scanner(System.in);
        System.out.println("输入数字");
        int input=sc.nextInt();
        int input2=input;

        //2.得到x的总共位数i
        int sum1=0,sum2=0;
        int i=0;
        while (input2!=0){
            input2/=10;
            i++;
        }
        input2=input;

        //3.判断奇偶性(方便确认循环对比的次数)
        if(i%2!=0){
            //3.1.奇数情况
            int head,last;
            //因为知道需要循环的次数(i-1)/2,代表把奇数对半折,看一半的数字,用for循环
            for(int j=1;j<=(i-1)/2;j++){
                //记录本轮需要比较的尾数的数字
                last=input2%10;
                //记录原数字应该除以的数字exp(10的倍数),用于得到首数,例如1234是一个4位数,就应该除以10的三次方1000,得到首数1
                //j代表循环的次数,每一次循环需要砍掉2个数字,第一次不需要砍掉,所以砍掉的数字个数是(j-1)*2,用总个数i减去,得到剩下的数字个数k
                //需要用1乘k-1次10,得到需要除的数字exp
                int exp=1;
                for(int k=i-(j-1)*2;k-1>0;k--){
                    exp*=10;
                }
                //记录本轮需要比较的首数的数字
                head=input2/exp;
                //计算下一轮的数字
                //例如123除以100的余数就是23,23就是下一轮去掉首数的数字
                input2%=exp;
                //例如123除以10的余数就是3,3就是下一轮去掉尾数的数字
                input2/=10;
                //两数比较(先从条件又大到小,进行排除,最后再进行判断谁不是回文数,若无法排除,按就进行下一轮比较,直到比较到最后一轮数字)
                if(head!=last){
                    System.out.println("不是回文数");
                    break;
                //如果j==(i-1)/2,代表已经比较到了最后一轮数字,并且没有break,说明是回文数
                }else if(j==(i-1)/2){
                    System.out.println("是回文数");
                //无法排除,过进行下一轮比较(这里continue是多余的,因为for循环会自动进行下一轮比较,但是为了代码的可读性,还是加上continue)
                }else{
                    continue;
                }
            }
        }else{
            //3.2.偶数情况
            int head,last;
            for(int j=1;j<=i/2;j++){
                //记录尾数的数字
                last=input2%10;
                //记录首数应该除以的数字exp
                int exp=1;
                for(int k=i-(j-1)*2;k-1>0;k--){
                    exp*=10;
                }
                //记录首数
                head=input2/exp;
                //计算下一轮的数字
                input2=input2%exp;
                input2=input2/10;
                //两数比较
                if(head!=last){
                    System.out.println("不是回文数");
                    break;
                }else if(j==i/2){
                    System.out.println("是回文数");
                }else{
                    continue;
                }
            }
        }
    }
}
