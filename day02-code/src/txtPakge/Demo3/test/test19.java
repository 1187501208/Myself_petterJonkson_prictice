package txtPakge.Demo3.test;

import java.util.Random;

public class test19 {
    public static void main(String[] args) {
        //抽红包:奖品是现金红包,分别有{2,588,888,1000,10000}五个奖金.
        //请使用代码模拟抽奖,打印除每个奖项,奖项的出现顺序要随机且不重复.打印效果如下:(
        //随机顺序)

        //解决:用随机洗牌的方法把原数组顺序洗牌并将结果放进新的数组里面


        //创建数组
        int[] arr1 = {2, 588, 888, 1000, 10000};
        int[] arr2 = arr1;
        Random r = new Random();

        //1.抽中随机索引,依次把数组进行交换
        int temp=0;int randomIndex;
        for (int i=0;i<5;i++){
            randomIndex=r.nextInt(5);
            temp=arr2[i];
            arr2[i]=arr1[randomIndex];
            arr1[randomIndex]=temp;
        }

        //打印结果
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}