package txtPakge.Demo4;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf1=new GirlFriend();
        gf1.name="小可爱";
        gf1.age=18;
        gf1.gender="萌妹子";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();

        System.out.printf("\n========================\n");

        GirlFriend gf2 =new GirlFriend();
        gf2.name="小哥哥";
        gf2.age=20;
        gf2.gender="靓子";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);

        gf2.eat();
        gf2.sleep();

        System.out.printf("\n========================\n");
        GirlFriend2 gf3 =new GirlFriend2();

        //调用set方法传递数据并判断是否合法
        gf3.setName("小姐姐");
        gf3.setAge(22);
        gf3.setGender("会跳舞");

        //调用get方法得到返回值
        System.out.println(gf3.getName());
        System.out.println(gf3.getAge());
        System.out.println(gf3.getGender());

        gf2.eat();
        gf2.sleep();
    }
}
