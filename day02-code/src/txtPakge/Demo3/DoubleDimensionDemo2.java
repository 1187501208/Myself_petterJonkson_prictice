package txtPakge.Demo3;

public class DoubleDimensionDemo2 {
    public static void main(String[] args) {
        //二维数组


        //1.动态态初始化
        int[][] arr1 = new int[3][3];
        arr1[0][0]=10;

        //获取二维数组中的第一个元素
        System.out.println(arr1[0][0]+"\n");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
