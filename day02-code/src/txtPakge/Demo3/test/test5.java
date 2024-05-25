package txtPakge.Demo3.test;

public class test5 {
    public static void main(String[] args) {
        //需求:使用方法重载的思想,设计比较两个整数是否相同
        //要求:兼容全整数类型(byte,short,int,long)

        //调用
        compare(10,20);
        compare(12.1,12.4);
    }
    //定义方法
    public static void compare(byte b1,byte b2) {
        System.out.println(b1==b2);
    }
    public static void compare(double d1,double d2) {
        System.out.println(d1==d2);
    }
    public static void compare(int I1,int I2) {
        System.out.println(I1==I2);
    }
    public static void compare(long n1,long n2) {
        System.out.println(n1==n2);
    }
}
