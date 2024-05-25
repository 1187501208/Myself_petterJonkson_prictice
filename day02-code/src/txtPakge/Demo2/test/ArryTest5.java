package txtPakge.Demo2.test;

public class ArryTest5 {
    public static void main(String[] args) {
        //需求:已知数组元素为{33,5,22,44,55}请找出数组中最大值并打印在控制台


        //1.定义静态数组
        int[] arr={33,5,22,44,55};
        int max=arr[0];
        //2.找出最大值
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("最大值是"+max);
    }
}
