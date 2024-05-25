package txtPakge.Demo2.test;

public class ArryTest7 {
    public static void main(String[] args) {
        //需求:定义一个数组,存入1,2,3,4,5.交换首位元素对应索引
        //交换前:1,2,3,4,5
        //交换后:5,4,3,2,1

        //1.定义数组
        int[] arr={1,2,3,4,5};
        //2.定义中间变量进行交换
        int temp;
        for (int i = 0; i <= arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
