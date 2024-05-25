package txtPakge.Demo3;

public class DoubleDimensionDemo3 {
    public static void main(String[] args) {
        /*需求:某商城每个嫉妒的营业额如下:单位(万元)
        第一季度:22,66,44
        第二季度:77,33,88
        第三季度:11,66,99
        计算出每个季度总营业额和全年总营业额
         */

        //解法:用二维数组存放数据


        //1.创建数组
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {11, 66, 99}
        };

        //2.把数据求和并分别输出
        int countQuarterly = 0;
        int countYear = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                countQuarterly += arr[i][j];
            }
            System.out.print(countQuarterly + " ");
            countYear += countQuarterly;
        }
        System.out.println("\n" + countYear);
    }
}
