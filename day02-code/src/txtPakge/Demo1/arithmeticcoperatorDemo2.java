package txtPakge.Demo1;

public class arithmeticcoperatorDemo2 {
    //自增运算
    public static void main(String[] args) {
        //++和--
        int a=10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        //自增参与其他运算
        int x=10;
        int y=x++;
        int z=++x;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
