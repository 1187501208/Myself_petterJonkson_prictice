package txtPakge.Demo2.test;

public class ArryTest1 {
    public static void main(String[] args) {
        //定义一个数组,存储1,2,3,4,5
        //遍历数组得到每一个元素,求数组里面所有的数据和
        int[] arr={1,2,3,4,5};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i];
        }
        System.out.println(count);
    }
}
