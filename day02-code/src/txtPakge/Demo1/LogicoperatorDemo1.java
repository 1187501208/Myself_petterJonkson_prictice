package txtPakge.Demo1;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //1.&并且
        System.out.println("并且:");
        System.out.println(true&true);
        System.out.println(false&false);
        System.out.println(false&true);
        //2.|或者
        System.out.println("或者:");
        System.out.println(false|true);
        System.out.println(false|false);
        //3.^异或
        System.out.println("异或:");
        System.out.println(true^true);
        System.out.println(false^false);
        System.out.println(true^false);
        //4.非,取反
        System.out.println("非:");
        System.out.println(!false);
        System.out.println(!true);
        System.out.println(!!true);
    }
}
