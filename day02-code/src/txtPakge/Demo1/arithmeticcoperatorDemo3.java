package txtPakge.Demo1;

public class arithmeticcoperatorDemo3 {
    //赋值运算
    public static void main(String[] args) {
        //左右相加,再赋值
        int a=10;int b=20;byte c=14;
        //等同于a=a+b,并且赋值运算后面都隐藏了一个强制类型转换
        a+=b;
        //等同于c=(byte)(c+2),因为本身c+2之前会自动转化c为int类型,
        // +2后再强转为byte类型赋值给c
        c+=2;
        System.out.println(a+"\t"+b+"\t"+c);
    }
}
