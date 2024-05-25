package txtPakge.Demo5.Ping_Pang;

public class test {
    /*我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练，为了出国交流，
    跟乒乓球相关的人员都需要学习英语请用所有知识分析，在这个案例中，哪些是具体类
    ，哪些是抽象类，哪些是接口?

    乒乓球运动员:姓名，年龄，学打乒乓球，说英语
    篮球运动员:姓名，年龄，学打篮球
    乒乓球教练:姓名，年龄，教打乒乓球，说英语
    篮球教练:姓名，年龄，教打篮球
     */

    //逻辑结构:乒乓球教练-->乒乓球(一般父类)--->运动员(抽象类)
    //                       |------>运动(接口)
    //                       |------>说英语(内部方法)

    //        乒乓球队员--->乒乓球(一般父类)--->运动员(抽象类)
    //                       |------>运动(接口)
    //                       |------>说英语(内部方法)

    //        蓝球教练--->蓝球(抽象类)---->运动员(抽象类)
    //                       |------>运动(接口)

    //        蓝球队员--->蓝球(抽象类)---->运动员(抽象类)
    //                       |------>运动(接口)

    //可以分别定义蓝球和乒乓球的父类为抽象类和普通类(由是否需要重构某些方法来决定是使用抽象类继承还是普通继承),
    //如果需要实现动态接口(传入的结构方法是同一个父类,但是传入结构方法的参数分别是不同子类的)则使用多态
    public static void main(String[] args) {
        Basketball_captain bc=new Basketball_captain("李敏",12);
        Ping_Pang_captain pc=new Ping_Pang_captain("王菲",15);
        Ping_pang_team pt=new Ping_pang_team("刘覅",25);
        Basketball_team bt=new Basketball_team("周三",28);

        System.out.println("-----------------------------------");
        System.out.println(bc.getName()+","+bc.getAge());
        bc.play();
        System.out.println("-----------------------------------");
        System.out.println(bt.getName()+","+bt.getAge());
        bt.play();
        System.out.println("-----------------------------------");
        System.out.println(pc.getName()+","+pc.getAge());
        pc.play();pc.Speak();
        System.out.println("-----------------------------------");
        System.out.println(pt.getName()+","+pt.getAge());
        pt.play();pt.Speak();

    }




}
