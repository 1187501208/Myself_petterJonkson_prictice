package txtPakge.Demo3.test;

import java.util.Random;

public class test18 {
    public static void main(String[] args) {
        //抽红包:奖品是现金红包,分别有{2,588,888,1000,10000}五个奖金.
        //请使用代码模拟抽奖,打印除每个奖项,奖项的出现顺序要随机且不重复.打印效果如下:(
        //随机顺序)

        //解决:用随机数来抽取原数组的索引,找到对应数字,添加到新数组里面,
        //并且如果新数组已经有了该数字,就重新取随机数,直到找到
        //所有未被抽取的数字为止(但该方法效率较低,可以改进一下,增加后续未被抽取
        //数字被抽取的概率)


        //创建数组
        int[] arr1={2,588,888,1000,10000};
        int[] arr2=new int[5];
        Random r=new Random();

        //1.用count记录数组非重复数字被抽中的次数,次数到5就结束
        int count=0;
        while (count <= 4) {
            //2.把索引值用随机数抽取,并赋值给number
            int number=r.nextInt(5);

            //3.判断第二个数组是否已经有该数,如果有,就跳出循环重新抽取
            boolean flag =false;
            flag = contaims(arr2, arr1, number, flag);

            //4.根据是否已经有了重复的数来决定是否将新数字添加进arr2数组里面
            if(flag ==false){
                arr2[count]=arr1[number];
                count++;
            }
        }

        //打印结果
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

    //判断是arr2数组已经否存在该数的方法
    private static boolean contaims(int[] arr2, int[] arr1, int number, boolean flag) {
        int i=0;
        do{
            if(arr2[i]== arr1[number]){
                flag =true;
                break;
            } else {
                i++;
            }
        }while (i<5);
        return flag;
    }
}
