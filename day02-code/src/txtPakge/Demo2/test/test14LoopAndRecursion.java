package txtPakge.Demo2.test;

public class test14LoopAndRecursion {
    public static void main(String[] args) {
        /*//需求:世界上最高的山峰珠穆朗玛峰(8844.43米=8844430毫米),
        //加入有一张只,厚0.1毫米,折叠多少次可以达到珠穆朗玛峰的高度

        //1.初始化
        double sum=0.1;int i=0,hight=8844430;
        //2.while循环
        while (sum<=hight){
            sum*=2;
            i++;
        }
        System.out.println("总共折叠"+i+"次");*/

        //方法2,用尾递归
        /*int count=hight(0,0.1,8844430);
        System.out.println("总共折叠"+count+"次");*/

        //方法3,用递归
        int count=hight2(0);
        System.out.println("总共折叠"+count+"次");
        //静态主函数的静态变量
        System.out.println("总共折叠"+ test14LoopAndRecursion.count+"次");




    }
    /*//方法2,用尾递归
    private static int hight(int i,double sum,int hight){
        if (sum>hight){
            return i;
        }
        return hight(i+1,sum*2,hight);
    }*/

    //方法3,用递归
    //因为主函数是静态变量,所有的成员变量也要是静态变量,否则在本方法里面不能引用(本类是static类,不能引用非static变量)
    static int count=0;
    static int high=8844430;
    static double sum=0.1;
    private static int hight2(int i){
        //静态类的全局变量不能通过对象来引用,只能通过类名来引用,因此不能用this.xxx,this是对象的引用
        if (test14LoopAndRecursion.sum> test14LoopAndRecursion.high){
            count=i;
            return 0;
        }
        test14LoopAndRecursion.sum*=2;
        //递归调用一般都是在return后面进行加减运算,最后的返回值是递归调用的返回值
        //但是由于特殊情况返回的是递归的次数,我们也可以单独设置一个count全局变量,在最后统计来存储递归的次数i就行
        //见上面,这两个count变量是一样的(一个是返回值,一个是全局变量)
        return hight2(i+1)+1;
    }


}
