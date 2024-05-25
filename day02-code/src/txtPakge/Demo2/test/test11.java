package txtPakge.Demo2.test;

public class test11 {
    public static void main(String[] args) {
        //需求:把1-5求和,用循环语句
        //如果求和的j需要在其他地方也要用,就不能定义在for循环里面,
        //因为循环执行结束会被释放掉存储
        for(int i=1,j=0;i<=5;i++){
            j+=i;
            System.out.println(j);
        }
    }
}
