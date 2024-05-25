package txtPakge.Demo3;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标:调用方法和定义方法
        playGame();
        System.out.println(" ");
        playGame();
    }

    //定义方法
    public static void playGame() {
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("Game over");
    }
}

