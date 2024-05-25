package txtPakge.Demo2.test;

public class ArryTest2 {
    public static void main(String[] args) {
        //定义一个数组,存储1,2,3,4,5,6,7,8,9,10
        //遍历数组得到每一个元素,统计数组里面一共有多少个能被3整除的数字


        //1.定义数组
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int count=0;
        //2.遍历每一个数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //判断当前元素是否为3的倍数
            if(arr[i]%3==0){
                count++;
            }
        }
        //3.打印结果
        System.out.println("能被3整除的数字一共有"+count+"个");
    }
}
