package txtPakge.Demo4.test;

import java.util.Scanner;

public class FightGameTest {
    public static void main(String[] args) {
    //引入游戏玩家数据
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入玩家1的昵称:");
        String player1Name=sc.next();
        System.out.println("请输入玩家1的血量:(0-100)");
        int blood1=sc.nextInt();
        System.out.println("请输入玩家1的性别:");
        char gender1= sc.next().charAt(0);
        System.out.println("请输入玩家2的昵称:");
        String player2Name=sc.next();
        System.out.println("请输入玩家2的血量:(0-100)");
        int blood2=sc.nextInt();
        System.out.println("请输入玩家2的性别:");
        char gender2= sc.next().charAt(0);

        //引入游戏玩家
        FightGame player1=new FightGame(player1Name,blood1,gender1);
        FightGame player2 =new FightGame(player2Name,blood2,gender2);

    //展示玩家信息
        player1.showRoleInfo();
        player2.showRoleInfo();

    //回合制游戏
        //玩家1攻击玩家2
        while (true){
            player1.attackRole(player2);
            if(player2.getBlood()==0) {
                System.out.println(player1.getName() + "K.O.了" + player2.getName());
                break;
            }

        //玩家2攻击玩家1
            player2.attackRole(player1);
            if(player1.getBlood()==0){
                System.out.println(player2.getName()+"K.O.了"+player1.getName());
                break;
            }
        }
    }
}
