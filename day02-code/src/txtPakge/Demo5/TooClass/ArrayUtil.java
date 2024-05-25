package txtPakge.Demo5.TooClass;

public class ArrayUtil {
    /*需求:在实际开发中，经常会遇到一些数组使用的工具类。
    请按照如下要求编写一个数组的工具类:ArrayUtil
    1.提供一个工具类方法printArr，用于返回整数数组的内容。
    返回的字符串格式如:[10,20,50,34,100](只考虑整数数组，且只考虑一维数组)
    2.提供这样一个工具方法getAerage，用于返回平均分。(只考虑浮点型数组，且只考虑一维数组)
    3.定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。*/


    //私有化工具类(不让该工具类被创建对象,因为只需要里面的方法,工具的对象没有实际意义)
    private  ArrayUtil(){
    }


    //创建返回数组内容的方法
    public static String printArr(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    //创建返回平均分的方法
    public static double getAerage(double[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avr=sum/arr.length;
        return avr;
    }
}
