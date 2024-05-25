package txtPakge.Demo3.test;

public class test3 {
    public static void main(String[] args) {
        //需求:定义一个方法,求一家商场每个季度的营业额,根据方法再计算出全年营业额
        int sum1 = getSum(10,20,40);
        int sum2 = getSum(20,30,40);
        int sum3 = getSum(20,30,50);
        int sumYear=getSum(sum1,sum2,sum3);
        System.out.println(sumYear);
    }
    //定义长方形方法
    public static int getSum(int num1,int num2,int num3){
        int result=num1+num2+num3;
        return result;
    }
}
