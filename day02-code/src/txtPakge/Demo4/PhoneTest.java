package txtPakge.Demo4;

public class PhoneTest {
    public static void main(String[] args) {
        //属性
        Phone p=new Phone();
        //给手机赋值
        p.brand="小米";
        p.price=1999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //给第二个手机赋值
        Phone p2=new Phone();
        p2.brand="苹果";
        p2.price=9999;

        //获取值
        System.out.println(p2.brand);
        System.out.println(p2.price);

    }
}
