package txtPakge.Demo5.TooClass;

public class TestDemo {
    public static void main(String[] args) {
        //引用工具类
        int[] arr={12,23,43,15,33,12};
        double[] arr2={324,34,234,321,654.3};
        String result1= ArrayUtil.printArr(arr);
        double result2=ArrayUtil.getAerage(arr2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
