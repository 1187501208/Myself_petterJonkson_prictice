package txtPakge.Demo2.test;

public class ArryTest8 {
    public static void main(String[] args) {
        //需求:定义一个数组,存入1,2,3,4,5.交换首位元素对应索引
        //交换前:1,2,3,4,5
        //交换后:5,4,3,2,1

        //1.定义数组
        int[] arr={1,2,3,4,5};
        //2.定义中间变量进行交换
        int temp;
        //把i,j视为两边的数的下标,当二者同时往中间走时,就可以实现所有的互换,无论奇偶,走到中间停止
        for (int i = 0,j=arr.length-1; i <j; i++,j--) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
