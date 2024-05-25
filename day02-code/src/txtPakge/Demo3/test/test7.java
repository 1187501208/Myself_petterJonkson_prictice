package txtPakge.Demo3.test;

public class test7 {
    public static void main(String[] args) {
        //需求:设计一个方法求数组最大值,并返回


        //1.定义数组
        int[] arr={11,22,33,44,55};

        //3.调用最大值方法
        int max=getMax(arr);
        System.out.println("最大值是:"+max);
    }

    //2.定义遍历方法
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
