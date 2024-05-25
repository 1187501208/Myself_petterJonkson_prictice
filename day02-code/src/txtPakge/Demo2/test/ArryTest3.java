package txtPakge.Demo2.test;

public class ArryTest3 {
    public static void main(String[] args) {
        //定义一个数组,存储1,2,3,4,5,6,7,8,9,10
        //遍历数组得到每一个元素,如果是奇数:把当前数字扩大两倍
        //如果是偶数:把当前数字变成二分之一


        //1.定义数组
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        //2.遍历每一个数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //判断当前元素奇偶性
            if(arr[i]%2!=0){
                //奇数扩大两倍
                arr[i]*=2;
            }else {
                //偶数缩小二分之一
                arr[i]/=2;
            }
        }
        //3.打印结果
        //一个循环尽量只做一件事情,方便后面对功能实现修改,模块化编程
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
