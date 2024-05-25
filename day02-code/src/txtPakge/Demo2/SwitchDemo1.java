package txtPakge.Demo2;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //需求:有四种拉面可供选择:兰州拉面\北京炸酱面\陕西油泼面\方便面
        //心里想吃的面条i跟其中一种相匹配

        //1.定义心里想吃的面
        String noodles="兰州拉面";
        //2.拿这个面和其他相匹配
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
        }
    }
}
