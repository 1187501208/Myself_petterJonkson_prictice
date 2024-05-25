package txtPakge.Demo2.test;

public class test2 {
    public static void main(String[] args) {
        //需求:汽车无人驾驶遇到交通灯进行判定,红灯停止,黄灯减速,绿灯行驶

        //1.定义交通灯情况
        boolean redlight=true;
        boolean yellolight=false;
        boolean greenlight=false;
        //2.判断行驶命令
        //对于输入常量判读,可以使用switch语句,如果用if-else语句,前面遇到true就不会再判断后面的了,后面是永远无法到达类型会报错,
        //且else后面不能加条件,因为else是所有条件都不满足时执行的
        if(redlight){
            System.out.println("请踩刹车!!");
        }
        if(yellolight){
            System.out.println("请减速");
        }
        if(greenlight){
            System.out.println("保持行驶");
        }
    }
}
