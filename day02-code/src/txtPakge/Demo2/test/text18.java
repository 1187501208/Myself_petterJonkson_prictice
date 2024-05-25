package txtPakge.Demo2.test;

public class text18 {
    public static void main(String[] args) {
        //需求:逢7过,从任意一个数字开始报数,当您要报的数字是包含7或者是7的倍数时都要说过,
        //使用程序打印出1-100之间的满足逢7过规则的数据

        //基础解法:把1-100之间的数字从个位到高位进行找余,用条件语句判断,'
        //包含7的数字打印"过",否则继续执行,并且把该数字整除7,余数为0的也打印7.

        //这里不建议用每一次数字i/10%10==7||i%10==7||i%7==0来判断,因为这只限于在1-100里面的1-2位数的数字判断,
        // 代码不具有通用性,在更高位范围比如1-1000,1-10000里面就不适用了


        //1.用循环语句依次输入1-100的数字
        for(int i=1;i<=100;i++){
            //2.用while循环切割每一个数字的尾数来判断各数位是否为7
            //切割i每一次的尾数位数字记录为temp,每一次i被切割剩下的数字记为temp2,
            int temp =0;int temp2=i;
            do{
                //求尾数
                temp=temp2%10;
                //通过除以10减去一位
                temp2/=10;
                //判断两种情况需要过:1.切割的当前尾数尾为7,2.该数本身i为7的倍数
                if(temp==7){
                    System.out.println(i+"过");
                    break;
                }else if(i%7==0) {
                    System.out.println(i + "过");
                    break;
                }else {
                        continue;
                }
            }while (temp2!=0);
        }
    }
}
