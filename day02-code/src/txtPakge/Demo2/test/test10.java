package txtPakge.Demo2.test;

public class test10 {
    public static void main(String[] args) {
        //需求:玩游戏断网需要断线重连,要求短线重连的语句只能重复执行5次
        //格式:第i次断线重连
        for (int i=1;i<=5;i++)
            System.out.println("第"+i+"次断线重连");

    }
}
