package txtPakge.Demo3.test;

public class test4 {
    public static void main(String[] args) {
        //需求:比较两个长方形的面积
        //调用面积计算方法
        double area1 = getArea(5.3, 5.2);
        double area2 = getArea(3.2, 5.5);
        //调用面积比较方法
        comparArea(area1, area2);
    }

    //定义长方形面积计算方法
    public static double getArea(double lenth, double width) {
        double result = lenth * width;
        return result;
    }

    //定义比较面积方法
    public static void comparArea(double area1, double area2) {
        if (area1 > area2) {
            System.out.println("第一个面积更大");
        } else if (area1 == area2) {
            System.out.println("两个面积一样");
        } else {
            System.out.println("第二个面积更大");
        }
    }
}
