package txtPakge.Demo3.test;

import java.util.Random;

public class test15 {
    public static void main(String[] args) {
        //评委打分,6名评委打分范围是[0-100]之间的整数
        //选手的最后得分是:去掉一个最高分\最低分后的4个评委的平均分


        //1.定义一个数组,用来装打分
        double markArr[]=new double[6];

        //2.用一个随机数方法生成分数放进数组
        getGrade(markArr);

        //4.生成最后得分方法
        double lastGrade = getLastGrade(markArr);

        //6.打印结果
        //String.format("%.xf",变量)是指定打印几位小数格式函数
        System.out.println("\n最终得分是:"+String.format("%.2f",lastGrade));
    }

    //3.随机数方法
    public static void getGrade(double arr[]) {
        Random r=new Random();
        System.out.println("每个评委打分:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextDouble(100);
            System.out.print(arr[i]+" ");
        }
    }

    //5.最后得分方法
    public static double getLastGrade(double arr[]) {
        double bigArr=arr[0];
        double LittleArr=arr[0];
        double lastGrade=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>bigArr){
                bigArr=arr[i];
            } else if (arr[i] < LittleArr) {
                LittleArr=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            lastGrade+=arr[i];
        }
        lastGrade=(lastGrade-bigArr-LittleArr)/(arr.length-2);
        return lastGrade;
    }
}
