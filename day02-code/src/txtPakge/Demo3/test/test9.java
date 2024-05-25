package txtPakge.Demo3.test;

public class test9 {
    public static void main(String[] args) {
        //需求:设计一个方法copuOfRange(int[] arr,int from,int to)
        //功能:将数组arr中从索引from(包含from)开始
        //到索引to结束(不包含to)的元素赋值到数组中
        //将新数组返回


        //1.定义原始数组
        int[] arr={1,2,3,4,5,6,7,8,9};

        //3.调用数组
        System.out.println("是否存在56:");
        int[] copyArr = copuOfRange(arr, 3, 7);
        //显示数组
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }

    //2.定义调用数组的方法
    public static int[] copuOfRange(int[] arr,int from,int to){
        int[] newArr=new int[to-from];
        for (int i = 0; i < newArr.length; i++,from++) {
            newArr[i]=arr[from];
        }
       return newArr;
    }
}
