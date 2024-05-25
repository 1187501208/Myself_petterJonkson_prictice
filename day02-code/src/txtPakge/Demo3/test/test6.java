package txtPakge.Demo3.test;

public class test6 {
    public static void main(String[] args) {
        //需求:设计一个方法用于数组遍历,要求遍历的结果是在一行上的,例如[11,22,33,44,55]


        //1.定义数组
        int[] arr={11,22,33,44,55};

        //3.调用遍历方法
        bianli(arr);
    }

    //2.定义遍历方法
    public static void bianli(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}
