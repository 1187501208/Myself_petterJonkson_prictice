package txtPakge.Demo3;

public class DoubleDimensionDemo1 {
    public static void main(String[] args) {
        //二维数组


        //1.静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {1, 2, 3}};
        int[][] arr2 = {{1, 2, 3}, {1, 2, 3, 4, 5}};
        //建议把每一个一维数组单独写一行
        int[][] arr3 = {
                {1, 2, 3},
                {1, 2, 3, 4, 5}
        };
        //获取二维数组中的第一个元素
        System.out.println(arr3[0][0]);
        //获取二维数组中的第一维数组(地址值):[I@2f4d3709
        System.out.println(arr3[0]+"\n ");
        //二维数组遍历
        for(int i=0;i<arr3.length;i++){
            //一维数组遍历
            for(int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j]);
            }
            System.out.println("");
        }
    }
}
