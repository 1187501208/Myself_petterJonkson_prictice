package txtPakge.Demo3.test;

public class test8 {
    public static void main(String[] args) {
        //需求:设计一个方法判断数组中的某一个数知否存在,把结果返回调用处


        //1.定义数组
        int[] arr={12,34,56,67,89};

        //调用数组判断56是否存在
        System.out.println("是否存在56:");
        boolean flag = getnum(arr);
        if(flag==true){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
    }

    //2.定义遍历方法
    public static boolean getnum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==56) {
                //这里没有用break,用铭牌方式来记录true和false,因为这里的返回值是
                //布尔类型,可以直接return当前值,并终止整个方法,和break办在时间
                //复杂度上其实是一样的
                return true;
            }
        }
        return false;
    }
}
