package txtPakge.Demo2.test;

public class test12 {
    public static void main(String[] args) {
        //需求:把1-100中的偶数求和


        //1.确定嵌套:for循环+条件运算/
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=(i%2==0?i:0);
        }
        System.out.println(sum);
    }
}
