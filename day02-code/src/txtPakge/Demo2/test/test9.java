package txtPakge.Demo2.test;

public class test9 {
    public static void main(String[] args) {
        //需求:打印1-5
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        //需求:打印5-1,局部变量的i可以重复定义
        for (int i=5;i>=1;i--)
            System.out.println(i);
    }
}
